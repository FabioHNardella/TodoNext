package br.todonext.todonext.DTO.User;

import br.todonext.todonext.Enum.UserRoles;

public class UserCreateRequestDTO {
    private String name;
    private String email;
    private String password;
    private UserRoles role;
}
