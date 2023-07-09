package com.atul.health.HealthService.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user/auth")
public class AuthController {

    @GetMapping("/login")
    public String login()
    {
        return "login works";
    }

    @GetMapping("/register")
    public String register()
    {
        return "Registration successful";
    }


}
