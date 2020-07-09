package com.example.demojwt.repo;

import com.example.demojwt.entity.dto.UserTO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OAuthRepo extends CrudRepository<UserTO, Long> {

    UserTO findByUsername(String username);
}
