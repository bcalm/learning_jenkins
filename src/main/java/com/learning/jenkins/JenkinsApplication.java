package com.learning.jenkins;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsApplication {
    public static void main(String[] args) {
        String username = System.getProperty("Username");
        System.out.println(username);
        System.out.println(System.getenv("username"));
    }
}