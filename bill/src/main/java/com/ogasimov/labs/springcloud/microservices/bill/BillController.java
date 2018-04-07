package com.ogasimov.labs.springcloud.microservices.bill;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
public class BillController {
  private final BillService billService;

  @GetMapping("/")
  @HystrixCommand
  public void index() {
    log.info("Bill index");
  }

  @PostMapping("/bill/{tableId}/{orderId}")
  @HystrixCommand
  public void createBill(@PathVariable Integer tableId, @PathVariable Integer orderId) {
    billService.createBill(tableId, orderId);
  }

  @DeleteMapping("/bills/{tableId}")
  @HystrixCommand
  public void payBills(@PathVariable Integer tableId) {
    billService.payBills(tableId);
  }
}
