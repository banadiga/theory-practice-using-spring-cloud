package com.ogasimov.labs.springcloud.microservices.order;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Slf4j
@RestController
@RequiredArgsConstructor
public class MenuController {
  private final MenuService menuService;

  @GetMapping("/")
  @HystrixCommand
  public void index() {
    log.info("Menu index");
  }

  @GetMapping("/menu")
  @HystrixCommand
  public Map<Integer, String> getMenu() {
    return menuService.getMenuItems();
  }
}
