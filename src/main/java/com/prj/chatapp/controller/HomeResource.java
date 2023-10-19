package com.prj.chatapp.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {

    @GetMapping("/home")
    public String home() {
        return ("<h1>Welcome</h1>");
    }
    
    @GetMapping("/usr")
    @CrossOrigin(origins = "http://localhost:3000", allowedHeaders = {"Requestor-Type", "Authorization"}, exposedHeaders = "X-Get-Header")
    public String user() {
        return ("<h1>Welcome User</h1>");
    }

    @GetMapping("/admin")
    @CrossOrigin(origins = "http://localhost:3000", allowedHeaders = {"Requestor-Type", "Authorization"}, exposedHeaders = "X-Get-Header")
    public String admin() {
        return ("<h1>Welcome Admin</h1>");
    }
}

