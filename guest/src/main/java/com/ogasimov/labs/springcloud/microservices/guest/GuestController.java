package com.ogasimov.labs.springcloud.microservices.guest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuestController {
  @Autowired
  private DinnerService dinnerService;

  @PostMapping("/dinner")
  public Integer startDinner(@RequestBody List<Integer> menuItems) {
    return null;
  }

  @DeleteMapping("/dinner/{tableId}")
  public void finishDinner(@PathVariable Integer tableId) {
  }
}
