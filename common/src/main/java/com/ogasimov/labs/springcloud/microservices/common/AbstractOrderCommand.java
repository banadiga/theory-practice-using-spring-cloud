package com.ogasimov.labs.springcloud.microservices.common;

public abstract class AbstractOrderCommand {
  private Integer tableId;

  public AbstractOrderCommand(Integer tableId) {
    this.tableId = tableId;
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

    AbstractOrderCommand that = (AbstractOrderCommand) o;

    return tableId != null ? tableId.equals(that.tableId) : that.tableId == null;
  }

  @Override
  public int hashCode() {
    return tableId != null ? tableId.hashCode() : 0;
  }

  @Override
  public String toString() {
    return this.getClass().getSimpleName() + "{" +
           "tableId=" + tableId +
           '}';
  }
}
