package com.example.demojwt.entity;

import com.example.demojwt.entity.dto.UserTO;
import org.springframework.security.core.userdetails.User;

public class CustomUser extends User {

    public CustomUser(UserAuth user) {
        super(user.getUsername(), user.getPassword(), user.getGrantedAuthoritiesList());
    }
}
