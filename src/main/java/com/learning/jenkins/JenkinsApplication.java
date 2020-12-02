package com.learning.jenkins;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsApplication {
    public static void main(String[] args) {
        System.out.println(System.getenv("Username"));
        System.out.println(System.getenv());
    }
}