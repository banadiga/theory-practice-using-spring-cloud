package com.ogasimov.labs.springcloud.microservices.bill;

import lombok.AllArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class BillController {
  private final BillService billService;

  @PostMapping("/bill/{tableId}/{orderId}")
  public void createBill(@PathVariable Integer tableId, @PathVariable Integer orderId) {
    billService.createBill(tableId, orderId);
  }

  @DeleteMapping("/bills/{tableId}")
  public void payBills(@PathVariable Integer tableId) {
    billService.payBills(tableId);
  }
}
