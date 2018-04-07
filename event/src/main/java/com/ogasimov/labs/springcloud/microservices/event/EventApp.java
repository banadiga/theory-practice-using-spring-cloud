package com.ogasimov.labs.springcloud.microservices.event;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.bus.jackson.RemoteApplicationEventScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@EnableEurekaClient
@EnableHystrix
@SpringBootApplication
@RemoteApplicationEventScan(basePackages = {"com.ogasimov.labs.springcloud.microservices.common", "com.ogasimov.labs.springcloud.microservices.event"})
public class EventApp {
  public static void main(String[] args) {
    SpringApplication.run(EventApp.class, args);
  }
}
