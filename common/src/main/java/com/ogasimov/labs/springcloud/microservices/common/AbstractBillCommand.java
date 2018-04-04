package com.ogasimov.labs.springcloud.microservices.common;

public abstract class AbstractBillCommand {
  private Integer tableId;

  public AbstractBillCommand(Integer tableId) {
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

    AbstractBillCommand that = (AbstractBillCommand) o;

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
