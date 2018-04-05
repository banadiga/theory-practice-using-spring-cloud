package com.ogasimov.labs.springcloud.microservices.table;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Log4j
@RestController
@AllArgsConstructor
public class TableController {
  private final TableService tableService;

  @GetMapping("/")
  @HystrixCommand
  public void index() {
    log.info("Guest index");
  }

  @GetMapping("/tables")
  @HystrixCommand
  public List<Integer> getTables() {
    return tableService.getTableIds();
  }

  @GetMapping("/tables/free")
  @HystrixCommand
  public List<Integer> getFreeTables() {
    return tableService.getFreeTableIds();
  }

  @PutMapping("/table/{id}/free")
  @HystrixCommand
  public void freeTable(@PathVariable Integer id) {
    tableService.updateTable(id, true);
  }

  @PutMapping("/table/{id}/occupy")
  @HystrixCommand
  public void occupyTable(@PathVariable Integer id) {
    tableService.updateTable(id, false);
  }
}
