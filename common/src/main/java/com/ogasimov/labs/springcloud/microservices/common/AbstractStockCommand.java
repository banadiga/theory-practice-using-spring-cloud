package com.ogasimov.labs.springcloud.microservices.common;

import java.util.List;

public abstract class AbstractStockCommand {
  private List<Integer> menuItems;

  public AbstractStockCommand(List<Integer> menuItems) {
    this.menuItems = menuItems;
  }

  public List<Integer> getMenuItems() {
    return menuItems;
  }

  public void setMenuItems(List<Integer> menuItems) {
    this.menuItems = menuItems;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    AbstractStockCommand that = (AbstractStockCommand) o;

    return menuItems != null ? menuItems.equals(that.menuItems) : that.menuItems == null;
  }

  @Override
  public int hashCode() {
    return menuItems != null ? menuItems.hashCode() : 0;
  }

  @Override
  public String toString() {
    return this.getClass().getSimpleName() + "{" +
           "menuItems=" + menuItems +
           '}';
  }
}
