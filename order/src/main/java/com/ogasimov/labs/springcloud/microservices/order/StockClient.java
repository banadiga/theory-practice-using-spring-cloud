package com.ogasimov.labs.springcloud.microservices.order;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient("Stock")
public interface StockClient {
  @DeleteMapping("/stock")
  void minusFromStock(@RequestBody List<Integer> menuItems);
}
