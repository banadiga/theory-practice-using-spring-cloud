package com.ogasimov.labs.springcloud.microservices.guest;

public interface BillClient {
  void payBills(Integer tableId);
}
