package com.ogasimov.labs.springcloud.microservices.stock;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
public class StockController {
  private final StockService stockService;

  @GetMapping("/")
  @HystrixCommand
  public void index() {
    log.info("Stock index");
  }

  @DeleteMapping("/stock")
  @HystrixCommand
  public void minusFromStock(@RequestBody List<Integer> menuItems) {
    stockService.minusFromStock(menuItems);
  }
}
