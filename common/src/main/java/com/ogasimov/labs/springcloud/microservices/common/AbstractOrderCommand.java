package com.ogasimov.labs.springcloud.microservices.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString
@EqualsAndHashCode
@AllArgsConstructor
public abstract class AbstractOrderCommand {
  private Integer tableId;
}