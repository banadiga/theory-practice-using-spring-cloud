package com.ogasimov.labs.springcloud.microservices.guest;

import lombok.AllArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class DinnerService {
  private final TableClient tableClient;
  private final OrderClient orderClient;
  private final BillClient billClient;

  public Integer startDinner(List<Integer> menuItems) {
    //check free tables
    List<Integer> freeTables = tableClient.getFreeTables();
    if (freeTables.size() == 0) {
      throw new RuntimeException("No free tables available.");
    }

    //occupy a table
    final Integer tableId = freeTables.get(0);
    tableClient.occupyTable(tableId);

    //create the order
    orderClient.createOrder(tableId, menuItems);

    return tableId;
  }

  public void finishDinner(Integer tableId) {
    billClient.payBills(tableId);
  }
}
