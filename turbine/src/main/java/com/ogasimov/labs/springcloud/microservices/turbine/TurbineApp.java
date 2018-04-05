package com.ogasimov.labs.springcloud.microservices.turbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class TurbineApp {
  public static void main(String[] args) {
    SpringApplication.run(TurbineApp.class, args);
  }
}
