package br.todonext.todonext.Service;

import br.todonext.todonext.DTO.User.UserSignupRequestDTO;
import br.todonext.todonext.Entity.User;
import br.todonext.todonext.Enum.UserRoles;
import br.todonext.todonext.Exception.EmailBeingUsedException;
import br.todonext.todonext.Security.PasswordEncoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.todonext.todonext.Repository.UserRepository;

import java.time.LocalDate;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;
    @Autowired
    private PasswordEncoder passwordEncoder;


    //signup
    public User signup(UserSignupRequestDTO dto){
        if(repository.existsByEmail(dto.getEmail())){
            throw new EmailBeingUsedException("Email is already being used!");
        }
            String hashedPassword = passwordEncoder.hashPassword(dto.getPassword());
            return repository.save(new User(dto.getName(), dto.getEmail(), hashedPassword, UserRoles.DEFAULT, LocalDate.now()));
    }

    //login


    //logoff






}
