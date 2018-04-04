package com.ogasimov.labs.springcloud.microservices.order;

import java.util.List;

//import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;

//@FeignClient("Stock")
public interface StockClient {
  @DeleteMapping("/stock")
  void minusFromStock(@RequestBody List<Integer> menuItems);
}
