package br.todonext.todonext.controller;

import br.todonext.todonext.dto.user.UserSignupRequestDTO;
import br.todonext.todonext.entity.User;
import br.todonext.todonext.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }


    @PostMapping("/signup")
    public User signup(@RequestBody UserSignupRequestDTO dto){
        return service.signup(dto);
    }



}
