package com.e_commerce.training.e_commerce.dto;

import lombok.Data;

@Data
public class AuthenticationRequest {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
