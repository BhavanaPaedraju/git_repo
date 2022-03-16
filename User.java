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
    private String firstname;
    private String Lastname;
    private String email;
    private Long phone;
    private String profile;

    private boolean enable = true;
    private List<UserRole> userRole;

//	@OneToMany(cascade = CascadeType.All,fetch = FetchType.EAGER,MappedBy="user")


    public User() {
        super();
        // TODO Auto-generated constructor stub
    }


    public User(Long id, String username, String password, String firstname, String lastname, String email, Long phone,
                String profile, boolean enable, List<UserRole> userRole) {
        super();
        this.id = id;
        this.username = username;
        this.password = password;
        this.firstname = firstname;
        this.Lastname = lastname;
        this.email = email;
        this.phone = phone;
        this.profile = profile;
        this.enable = enable;
        this.userRole = userRole;
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

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        this.Lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }


    public String getProfile() {
        return profile;
    }


    public void setProfile(String profile) {
        this.profile = profile;
    }


    public List<UserRole> getUserRole() {
        return userRole;
    }


    public void setUserRole(List<UserRole> userRole) {
        this.userRole = userRole;
    }
}