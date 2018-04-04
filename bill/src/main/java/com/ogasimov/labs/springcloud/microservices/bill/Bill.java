package com.ogasimov.labs.springcloud.microservices.bill;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "bills")
public class Bill {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  @Column(name = "table_id")
  private Integer tableId;
  @Column(name = "order_id")
  private Integer orderId;

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

  public Integer getOrderId() {
    return orderId;
  }

  public void setOrderId(Integer orderId) {
    this.orderId = orderId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Bill bill = (Bill) o;

    if (id != null ? !id.equals(bill.id) : bill.id != null) return false;
    if (tableId != null ? !tableId.equals(bill.tableId) : bill.tableId != null) return false;
    return orderId != null ? orderId.equals(bill.orderId) : bill.orderId == null;
  }

  @Override
  public int hashCode() {
    int result = id != null ? id.hashCode() : 0;
    result = 31 * result + (tableId != null ? tableId.hashCode() : 0);
    result = 31 * result + (orderId != null ? orderId.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "Bill{" +
           "id=" + id +
           ", tableId=" + tableId +
           ", orderId=" + orderId +
           '}';
  }
}
