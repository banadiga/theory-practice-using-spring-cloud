package com.ogasimov.labs.springcloud.microservices.bill;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@ToString
@EqualsAndHashCode
@Entity(name = "bills")
public class Bill {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  @Column(name = "table_id")
  private Integer tableId;
  @Column(name = "order_id")
  private Integer orderId;
}
