package com.nader.gymproject.threeplates.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Exercise {
    @Id
    private Long id;
    @Column
    private String name;
}
