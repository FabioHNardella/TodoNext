package br.todonext.todonext.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "roles")
@Getter
public class Role {
    @Column(name = "role_id")
    @Id
    private int id;
    @Column(name = "role_name")
    @Setter
    private String name;
}
