package com.ogasimov.labs.springcloud.microservices.guest;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient("Order")
public interface OrderClient {

  @PostMapping("/order/{tableId}")
  Integer createOrder(Integer tableId/*, List<Integer> menuItems*/);
}
