package com.docker_app.DockerApplication.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/docker")
public class WelcomeController {
    @GetMapping("/simple")
    public String getMsg(){
        return "Hello world";
    }
}
