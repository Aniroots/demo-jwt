package com.example.demojwt.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    Logger log = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/health-check")
    public String healthCheck() {
        log.debug("debug healthCheck");
        log.info("info healthCheck");

        return "Good!";
    }

    @GetMapping("/")
    public String index(@AuthenticationPrincipal Jwt jwt) {
        return String.format("Hello, %s!", jwt.getClaims());
    }

}
