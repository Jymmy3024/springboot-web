package com.jimmy.curo.springboot.webapp.springboot_web.models.dto;

import com.jimmy.curo.springboot.webapp.springboot_web.models.User;

public class UserDto {
    private String title;
    private User user;

    //Generacion de getters and setters
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }   
}
