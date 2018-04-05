package com.ogasimov.labs.springcloud.microservices.order;

import lombok.AllArgsConstructor;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class MenuController {
  private final MenuService menuService;

  @GetMapping("/menu")
  public Map<Integer, String> getMenu() {
    return menuService.getMenuItems();
  }
}
