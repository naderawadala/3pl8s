package com.nader.gymproject.threeplates.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column
    private String user_name;
    @Column
    private String password;
    @OneToOne
    @JoinColumn(name = "role_id")
    private Role role;
}
