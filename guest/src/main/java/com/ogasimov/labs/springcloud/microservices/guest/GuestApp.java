package com.ogasimov.labs.springcloud.microservices.guest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GuestApp {
  public static void main(String[] args) {
    SpringApplication.run(GuestApp.class, args);
  }
}
