package com.m2.user.model;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;



@Document(collection="userInfo")
public class User implements UserDetails {

    private Long id;
    private String username;
    private String password;
    private int age;


    public User() {
        super();
        // TODO Auto-generated constructor stub
    }


    public User(Long id, String username, String password, int age) {
        super();
        this.id = id;
        this.username = username;
        this.password = password;
        this.age = age;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}