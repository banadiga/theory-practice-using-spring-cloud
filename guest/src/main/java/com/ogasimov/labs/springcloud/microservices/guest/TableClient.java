package com.ogasimov.labs.springcloud.microservices.guest;

import java.util.List;

public interface TableClient {
  List<Integer> getFreeTables();

  void freeTable(Integer id);

  void occupyTable(Integer id);
}
