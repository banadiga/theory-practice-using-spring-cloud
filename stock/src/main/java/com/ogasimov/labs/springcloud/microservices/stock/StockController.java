package com.ogasimov.labs.springcloud.microservices.stock;

import lombok.AllArgsConstructor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class StockController {
  private final StockService stockService;

  @DeleteMapping("/stock")
  public void minusFromStock(@RequestBody List<Integer> menuItems) {
    stockService.minusFromStock(menuItems);
  }
}
