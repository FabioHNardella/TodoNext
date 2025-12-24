package br.todonext.todonext.Entity;

import br.todonext.todonext.Enum.UserRoles;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id", nullable = false)
    private long id;

    @Column(name = "user_name", nullable = false)
    @Setter
    private String name;

    @Column(name = "user_email", nullable = false, unique = true)
    @Setter
    private String email;

    @Column(name = "user_password", nullable = false)
    @Setter
    private String password;

    @Column(name = "user_role", nullable = false)
    private UserRoles role;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Task> tasks = new ArrayList<>();

    @Column(name = "user_creation_date", nullable = false)
    @Setter
    private LocalDate creationDate;

    public User(String name, String email, String password, UserRoles role, LocalDate creationDate) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.creationDate = creationDate;
    }
}
