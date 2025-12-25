package br.todonext.todonext.service;

import br.todonext.todonext.dto.user.UserSignupRequestDTO;
import br.todonext.todonext.entity.Role;
import br.todonext.todonext.entity.User;
import br.todonext.todonext.exception.EmailAreadyUsedException;
import br.todonext.todonext.repository.UserRepository;
import br.todonext.todonext.security.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class UserService {
    private final PasswordEncoder encoder;
    private final UserRepository userRepository;
    private final RoleService roleService;

    public UserService(PasswordEncoder encoder, UserRepository userRepository, RoleService roleService) {
        this.encoder = encoder;
        this.userRepository = userRepository;
        this.roleService = roleService;
    }


    public User signup(UserSignupRequestDTO dto){
       if( userRepository.existsByEmail(dto.getEmail())){
           throw new EmailAreadyUsedException("Email is already being used! Try another.");
       }
        String hashedPassword = encoder.hash(dto.getPassword());
        Role defaultRole = roleService.getDefaultRole();
       return userRepository.save(new User(
               dto.getName(),
               dto.getEmail(),
               hashedPassword,
               defaultRole,
               LocalDate.now()));
    }
}
