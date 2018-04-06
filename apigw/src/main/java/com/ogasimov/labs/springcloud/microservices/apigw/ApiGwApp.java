package com.ogasimov.labs.springcloud.microservices.apigw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@EnableHystrix
@EnableEurekaClient
@SpringBootApplication
public class ApiGwApp {
  public static void main(String[] args) {
    SpringApplication.run(ApiGwApp.class, args);
  }
}
