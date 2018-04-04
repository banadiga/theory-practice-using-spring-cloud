package com.ogasimov.labs.springcloud.microservices.table;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TableController {
  @Autowired
  private TableService tableService;

  @GetMapping("/tables")
  public List<Integer> getTables() {
    return null;
  }

  @GetMapping("/tables/free")
  public List<Integer> getFreeTables() {
    return null;
  }

  @PutMapping("/table/{id}/free")
  public void freeTable(@PathVariable Integer id) {
  }

  @PutMapping("/table/{id}/occupy")
  public void occupyTable(@PathVariable Integer id) {
  }
}
