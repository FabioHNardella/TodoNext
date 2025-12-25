package br.todonext.todonext.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter
@Entity
@Table(name = "users")
public class User {
    @Id
    @Column(name = "user_id", nullable = false)
    private long id;

    @Setter
    @Column(name = "user_name", nullable = false)
    private String name;

    @Setter
    @Column(name = "user_email", nullable = false, unique = true)
    private String email;

    @Setter
    @Column(name = "user_password", nullable = false)
    private String password;

    @ManyToOne
    @JoinColumn(name = "role_id", nullable = false)
    private Role role;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Task> tasks = new ArrayList<>();

    @Column(name = "user_creation_date", nullable = false)
    private final LocalDate creationDate;

    public User(String name, String email, String password, Role role, LocalDate creationDate) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.role = role;
        this.creationDate = creationDate;
    }
}
