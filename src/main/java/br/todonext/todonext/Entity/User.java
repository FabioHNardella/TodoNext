package br.todonext.todonext.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id", nullable = false)
    private long id;

    @Column(name = "user_name", nullable = false)
    private String name;

    @Column(name = "user_email", nullable = false, unique = true)
    private String email;

    @Column(name = "user_password", nullable = false)
    private String password;

    @Column(name = "user_role", nullable = false)

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Task> tasks = new ArrayList<>();

    @Column(name = "user_creation_date", nullable = false)
    private LocalDate creationDate;
}
