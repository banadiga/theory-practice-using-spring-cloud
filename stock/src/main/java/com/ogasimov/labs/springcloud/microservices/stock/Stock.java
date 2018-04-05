package com.ogasimov.labs.springcloud.microservices.stock;

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
@Entity(name = "stock")
public class Stock {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  @Column(name = "menu_item_id")
  private Integer menuItemId;
  private Integer count;
}
