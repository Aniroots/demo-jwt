package com.example.demojwt.service;

import com.example.demojwt.entity.CustomUser;
import com.example.demojwt.entity.UserAuth;
import com.example.demojwt.entity.dto.UserTO;
import com.example.demojwt.repo.OAuthRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailService implements UserDetailsService {

    @Autowired
    private OAuthRepo oAuthRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        try {
            UserTO byUsername = null;
            byUsername = oAuthRepo.findByUsername(username);
            return new CustomUser(new UserAuth(byUsername));
        } catch (Exception e) {
            e.printStackTrace();
            throw new UsernameNotFoundException("user not found");
        }
    }
}
