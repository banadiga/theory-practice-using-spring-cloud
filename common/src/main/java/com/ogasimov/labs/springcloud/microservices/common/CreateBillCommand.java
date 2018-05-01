package com.ogasimov.labs.springcloud.microservices.common;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class CreateBillCommand extends AbstractBillCommand {
  private Integer orderId;

  public CreateBillCommand(Integer tableId, Integer orderId) {
    super(tableId);
    this.orderId = orderId;
  }
}
