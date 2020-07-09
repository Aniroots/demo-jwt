package com.example.demojwt.entity;

import com.example.demojwt.entity.dto.UserTO;
import org.springframework.security.core.GrantedAuthority;

import java.util.ArrayList;
import java.util.Collection;

public class UserAuth extends UserTO {

    private Collection<GrantedAuthority> grantedAuthoritiesList = new ArrayList<>();

    public UserAuth(UserTO userTO) {
        super.setUsername(userTO.getUsername());
        super.setPassword(userTO.getPassword());
    }

    public Collection<GrantedAuthority> getGrantedAuthoritiesList() {
        return grantedAuthoritiesList;
    }

    public void setGrantedAuthoritiesList(Collection<GrantedAuthority> grantedAuthoritiesList) {
        this.grantedAuthoritiesList = grantedAuthoritiesList;
    }
}
