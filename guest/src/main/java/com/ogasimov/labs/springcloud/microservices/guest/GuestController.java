package com.ogasimov.labs.springcloud.microservices.guest;

import lombok.AllArgsConstructor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class GuestController {
  private final DinnerService dinnerService;

  @PostMapping("/dinner")
  public Integer startDinner(@RequestBody List<Integer> menuItems) {
    return dinnerService.startDinner(menuItems);
  }

  @DeleteMapping("/dinner/{tableId}")
  public void finishDinner(@PathVariable Integer tableId) {
    dinnerService.finishDinner(tableId);
  }
}
