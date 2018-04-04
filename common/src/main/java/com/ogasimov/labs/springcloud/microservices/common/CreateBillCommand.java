package com.ogasimov.labs.springcloud.microservices.common;

public class CreateBillCommand extends AbstractBillCommand {
  private Integer orderId;

  public CreateBillCommand(Integer tableId, Integer orderId) {
    super(tableId);
    this.orderId = orderId;
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
    if (!super.equals(o)) return false;

    CreateBillCommand that = (CreateBillCommand) o;

    return orderId != null ? orderId.equals(that.orderId) : that.orderId == null;
  }

  @Override
  public int hashCode() {
    int result = super.hashCode();
    result = 31 * result + (orderId != null ? orderId.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "CreateBillCommand{" +
           "tableId=" + getTableId() +
           ", orderId=" + orderId +
           '}';
  }
}
