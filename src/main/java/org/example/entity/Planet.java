package org.example.entity;

import jakarta.persistence.*;

@Entity
@Table(name="planet")
public class Planet {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    @Column
    private String name;

    public void setName(String name) {
        this.name = name;
    }
}
