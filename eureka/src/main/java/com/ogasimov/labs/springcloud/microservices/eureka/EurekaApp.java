package com.ogasimov.labs.springcloud.microservices.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EurekaApp {
  public static void main(String[] args) {
    SpringApplication.run(EurekaApp.class, args);
  }
}
