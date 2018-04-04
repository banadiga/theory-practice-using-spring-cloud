package com.ogasimov.labs.springcloud.microservices.order;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
  @Autowired
  private OrderService orderService;

  @PostMapping("/order/{tableId}")
  public Integer createOrder(@PathVariable Integer tableId, @RequestBody List<Integer> menuItems) {
    return null;
  }
}
