package com.ogasimov.labs.springcloud.microservices.dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class DashboardApp {
  public static void main(String[] args) {
    SpringApplication.run(DashboardApp.class, args);
  }
}
