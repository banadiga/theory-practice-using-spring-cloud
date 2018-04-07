package com.ogasimov.labs.springcloud.microservices.common;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.List;

@Data
@ToString
@EqualsAndHashCode
public class CreateOrderCommand extends AbstractOrderCommand {
  private List<Integer> menuItems;

  public CreateOrderCommand(Integer tableId, List<Integer> menuItems) {
    super(tableId);
    this.menuItems = menuItems;
  }

}
