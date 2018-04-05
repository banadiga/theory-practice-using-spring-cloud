package com.ogasimov.labs.springcloud.microservices.guest;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("Bill")
public interface BillClient {

  @GetMapping("/bill/{tableId}")
  void payBills(Integer tableId);
}
