package com.ogasimov.labs.springcloud.microservices.common;

import java.util.List;

public class MinusStockCommand extends AbstractStockCommand {
  public MinusStockCommand(List<Integer> menuItems) {
    super(menuItems);
  }
}
