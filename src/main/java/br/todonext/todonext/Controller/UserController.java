package br.todonext.todonext.Controller;

import br.todonext.todonext.DTO.User.UserSignupRequestDTO;

import br.todonext.todonext.Entity.User;
import br.todonext.todonext.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService service;


    @PostMapping("/signup")
    public User signup(UserSignupRequestDTO dto){
        return service.signup(dto);
    }

}
