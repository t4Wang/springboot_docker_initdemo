package com.routz.dockerdemo.firstdocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@SpringBootApplication
@RestController
public class FirstdockerApplication {

    @GetMapping("/")
    public String home() throws UnknownHostException {
        return "Hello, there is " + InetAddress.getLocalHost().getHostName();
    }

    public static void main(String[] args) {
        SpringApplication.run(FirstdockerApplication.class, args);
    }

}
