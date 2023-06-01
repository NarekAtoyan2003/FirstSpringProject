package com.digi.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="users")
public class User {

    @Id
    private int id;

    @Column(name="first_name")
    private String name;

    @Column(name="last_name")
    private String surname;
    private int age;
    private String email;
    private String password;
    private String verification_code;

    @Enumerated(EnumType.STRING)
    private Status status;

}
