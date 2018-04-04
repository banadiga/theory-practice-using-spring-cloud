package com.ogasimov.labs.springcloud.microservices.order;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "orders")
public class Order {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  @Column(name = "table_id")
  private Integer tableId;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getTableId() {
    return tableId;
  }

  public void setTableId(Integer tableId) {
    this.tableId = tableId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Order order = (Order) o;

    if (id != null ? !id.equals(order.id) : order.id != null) return false;
    return tableId != null ? tableId.equals(order.tableId) : order.tableId == null;
  }

  @Override
  public int hashCode() {
    int result = id != null ? id.hashCode() : 0;
    result = 31 * result + (tableId != null ? tableId.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "Order{" +
           "id=" + id +
           ", tableId='" + tableId + '\'' +
           '}';
  }
}
