package com.example.GreetingApp.interfaces;

import com.example.GreetingApp.dto.AuthUserDTO;
import com.example.GreetingApp.dto.LoginDTO;
import com.example.GreetingApp.dto.PassDTO;
import org.springframework.stereotype.Service;

@Service
public interface IAuthInterface {

    public String register(AuthUserDTO user);


    public String login(LoginDTO user);

    public static AuthUserDTO forgotPassword(PassDTO pass, String email) {
        return null;
    }

    public static String resetPassword(String email, String currentPass, String newPass) {
        return null;
    }
}