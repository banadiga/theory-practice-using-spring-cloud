package com.ogasimov.labs.springcloud.microservices.stock;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Log4j
@RestController
@AllArgsConstructor
public class StockController {
  private final StockService stockService;

  @GetMapping("/")
  @HystrixCommand
  public void index() {
    log.info("Guest index");
  }

  @DeleteMapping("/stock")
  @HystrixCommand
  public void minusFromStock(@RequestBody List<Integer> menuItems) {
    stockService.minusFromStock(menuItems);
  }
}
