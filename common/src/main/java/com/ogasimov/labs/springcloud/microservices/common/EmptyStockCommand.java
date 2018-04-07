package com.ogasimov.labs.springcloud.microservices.common;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import org.springframework.cloud.bus.event.RemoteApplicationEvent;

@Data
@ToString
@EqualsAndHashCode
@NoArgsConstructor
public class EmptyStockCommand extends RemoteApplicationEvent {
  private String menuItem;

  public EmptyStockCommand(Object source, String originService, String menuItem) {
    super(source, originService);
    this.menuItem = menuItem;
  }
}
