package com.devstudios.redsocial.redsocial_backend.presentation.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api/auth")
public class AuthController {


    @PostMapping("/register")
    public String register(){
        return "register";
    }

    @PostMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/validate-token")
    public String validateToken(){
        return "validate token";
    }

    @DeleteMapping("/delete")
    public String delete(){
        return "delete account";
    }

    @GetMapping("/find-by-username")
    public String findByUsername(){
        return "find by username";
    }

    @GetMapping("/find-all")
    public String findAll(){
        return "find all";
    }

    @PutMapping("/update-account")
    public String update(){
        return "update";
    }

    @PutMapping("/reset-password/{code}")
    public String resetPassword( @PathVariable String code ){
        return "Reset password";
    }

    @GetMapping("/forgot-password")
    public String forgotPassword(){
        return "Forgot password";
    }

}
