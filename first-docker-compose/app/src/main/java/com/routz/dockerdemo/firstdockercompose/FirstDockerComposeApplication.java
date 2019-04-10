package com.routz.dockerdemo.firstdockercompose;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@SpringBootApplication
@RestController
public class FirstDockerComposeApplication {

    @GetMapping("/{name}")
    public String home(@PathVariable String name) throws UnknownHostException {
        return "Hello, My name is " + name + " and i'm in " + InetAddress.getLocalHost().getHostName();
    }

    public static void main(String[] args) {
        SpringApplication.run(FirstDockerComposeApplication.class, args);
    }

}
