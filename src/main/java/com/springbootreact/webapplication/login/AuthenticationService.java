package com.springbootreact.webapplication.login;

import org.springframework.stereotype.Service;

@Service // This will contain all the busines logic
public class AuthenticationService {

    public boolean authenticate(String username, String password) {
        boolean isValidUsername = username.equalsIgnoreCase("avinaashg");
        boolean isPasswordValid = password.equalsIgnoreCase("1234");

        return isValidUsername && isPasswordValid;

    }

}
