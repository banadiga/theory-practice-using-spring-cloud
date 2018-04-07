package com.ogasimov.labs.springcloud.microservices.guest;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
public class GuestController {
  private final DinnerService dinnerService;

  @GetMapping("/")
  @HystrixCommand
  public void index() {
    log.info("Guest index");
  }

  @PostMapping("/dinner")
  @HystrixCommand
  public Integer startDinner(@RequestBody List<Integer> menuItems) {
    return dinnerService.startDinner(menuItems);
  }

  @DeleteMapping("/dinner/{tableId}")
  @HystrixCommand
  public void finishDinner(@PathVariable Integer tableId) {
    dinnerService.finishDinner(tableId);
  }
}
