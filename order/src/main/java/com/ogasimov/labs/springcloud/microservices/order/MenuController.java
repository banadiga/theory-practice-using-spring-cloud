package com.ogasimov.labs.springcloud.microservices.order;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Log4j
@RestController
@AllArgsConstructor
public class MenuController {
  private final MenuService menuService;

  @GetMapping("/")
  @HystrixCommand
  public void index() {
    log.info("Guest index");
  }

  @GetMapping("/menu")
  @HystrixCommand
  public Map<Integer, String> getMenu() {
    return menuService.getMenuItems();
  }
}
