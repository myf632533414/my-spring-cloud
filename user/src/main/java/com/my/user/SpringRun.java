package com.my.user;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringRun {

    public static void main(String[] args) {
       SpringApplication.run(SpringRun.class,args);
    }
}
