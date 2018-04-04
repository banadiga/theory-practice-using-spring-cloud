package com.ogasimov.labs.springcloud.microservices.common;

import java.util.List;

public class CreateOrderCommand extends AbstractOrderCommand {
  private List<Integer> menuItems;

  public CreateOrderCommand(Integer tableId, List<Integer> menuItems) {
    super(tableId);
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
    if (!super.equals(o)) return false;

    CreateOrderCommand that = (CreateOrderCommand) o;

    return menuItems != null ? menuItems.equals(that.menuItems) : that.menuItems == null;
  }

  @Override
  public int hashCode() {
    int result = super.hashCode();
    result = 31 * result + (menuItems != null ? menuItems.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "CreateOrderCommand{" +
           "tableId=" + getTableId() +
           ", menuItems=" + menuItems +
           '}';
  }
}
