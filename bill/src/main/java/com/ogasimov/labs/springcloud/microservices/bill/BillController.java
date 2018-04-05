package com.ogasimov.labs.springcloud.microservices.bill;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Log4j
@RestController
@AllArgsConstructor
public class BillController {
  private final BillService billService;

  @GetMapping("/")
  @HystrixCommand
  public void index() {
    log.info("Guest index");
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
