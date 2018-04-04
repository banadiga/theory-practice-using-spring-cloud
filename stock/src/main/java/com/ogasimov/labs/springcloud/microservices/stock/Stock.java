package com.ogasimov.labs.springcloud.microservices.stock;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "stock")
public class Stock {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  @Column(name = "menu_item_id")
  private Integer menuItemId;
  private Integer count;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getMenuItemId() {
    return menuItemId;
  }

  public void setMenuItemId(Integer menuItemId) {
    this.menuItemId = menuItemId;
  }

  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Stock stock = (Stock) o;

    if (id != null ? !id.equals(stock.id) : stock.id != null) return false;
    if (menuItemId != null ? !menuItemId.equals(stock.menuItemId) : stock.menuItemId != null) return false;
    return count != null ? count.equals(stock.count) : stock.count == null;
  }

  @Override
  public int hashCode() {
    int result = id != null ? id.hashCode() : 0;
    result = 31 * result + (menuItemId != null ? menuItemId.hashCode() : 0);
    result = 31 * result + (count != null ? count.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "Stock{" +
           "id=" + id +
           ", menuItemId=" + menuItemId +
           ", count=" + count +
           '}';
  }
}
