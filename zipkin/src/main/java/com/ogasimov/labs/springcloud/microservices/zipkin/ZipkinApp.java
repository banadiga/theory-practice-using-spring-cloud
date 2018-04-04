package com.ogasimov.labs.springcloud.microservices.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ZipkinApp {
  public static void main(String[] args) {
    SpringApplication.run(ZipkinApp.class, args);
  }
}
