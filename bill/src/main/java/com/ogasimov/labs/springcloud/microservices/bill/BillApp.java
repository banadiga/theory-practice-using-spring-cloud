package com.ogasimov.labs.springcloud.microservices.bill;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class BillApp {
  public static void main(String[] args) {
    SpringApplication.run(BillApp.class, args);
  }
}
