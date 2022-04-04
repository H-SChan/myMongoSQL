package com.example.multiple_datebases2.model.mysql;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Entity
public class User {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String nickname;

    public User(String name, String nickname) {
        this.name = name;
        this.nickname = nickname;
    }

    public User() {
    }
}
