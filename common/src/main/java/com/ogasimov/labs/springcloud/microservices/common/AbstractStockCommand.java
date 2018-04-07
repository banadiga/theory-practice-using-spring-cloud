package com.ogasimov.labs.springcloud.microservices.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.List;

@Data
@ToString
@EqualsAndHashCode
@AllArgsConstructor
public abstract class AbstractStockCommand {
  private List<Integer> menuItems;
}
