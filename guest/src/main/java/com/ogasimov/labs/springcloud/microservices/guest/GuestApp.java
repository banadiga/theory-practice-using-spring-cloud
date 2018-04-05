package com.ogasimov.labs.springcloud.microservices.guest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@EnableHystrix
@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication
public class GuestApp {
  public static void main(String[] args) {
    SpringApplication.run(GuestApp.class, args);
  }
}
