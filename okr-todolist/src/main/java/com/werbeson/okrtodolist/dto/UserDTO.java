package com.werbeson.okrtodolist.dto;

import java.io.Serializable;

import com.werbeson.okrtodolist.domain.User;

public class UserDTO implements Serializable{

    public static final long SerialVersionUID = 1L;

    private Integer id;
    private String name;
    private String  email;
    private String password;

    public UserDTO() {
        super();
    }
    public UserDTO(User obj) {
        super();
        this.id = obj.getId();
        this.name = obj.getName();
        this.email = obj.getEmail();
        this.password = obj.getPassword();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
