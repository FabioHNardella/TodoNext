package br.todonext.todonext.DTO.User;

import lombok.Getter;

@Getter
public class UserSignupRequestDTO {
    private String name;
    private String email;
    private String password;
}
