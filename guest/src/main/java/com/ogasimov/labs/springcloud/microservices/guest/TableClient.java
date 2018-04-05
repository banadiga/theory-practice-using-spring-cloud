package com.ogasimov.labs.springcloud.microservices.guest;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;

@FeignClient("Table")
public interface TableClient {

  @GetMapping("/tables/free")
  List<Integer> getFreeTables();

  @PutMapping("/table/{id}/free")
  void freeTable(Integer id);

  @PutMapping("/table/{id}/occupy")
  void occupyTable(Integer id);
}
