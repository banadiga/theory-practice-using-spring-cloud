package com.ogasimov.labs.springcloud.microservices.bill;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BillController {
  @Autowired
  private BillService billService;

  @PostMapping("/bill/{tableId}/{orderId}")
  public void createBill(@PathVariable Integer tableId, @PathVariable Integer orderId) {
  }

  @DeleteMapping("/bills/{tableId}")
  public void payBills(@PathVariable Integer tableId) {
  }
}
