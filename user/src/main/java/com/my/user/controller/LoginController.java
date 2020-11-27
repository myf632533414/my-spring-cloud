package com.my.user.controller;

import com.my.user.anno.MyAnno;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {

    @GetMapping("/login")
    @MyAnno("ddasda")
    public void login(){
        return;
    }
}
