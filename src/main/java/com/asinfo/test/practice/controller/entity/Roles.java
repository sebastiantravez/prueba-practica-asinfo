package com.asinfo.test.practice.controller.entity;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "roles")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Roles {

    @Id
    @Column(name = "id_rol")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idRol;

    @Column(name = "name")
    private String name;

    @Builder.Default
    @ManyToMany(mappedBy = "roles", cascade = { CascadeType.ALL })
    private Set<Users> users = new HashSet<>();
}
