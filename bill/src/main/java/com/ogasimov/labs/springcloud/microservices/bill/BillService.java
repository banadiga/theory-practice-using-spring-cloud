package com.ogasimov.labs.springcloud.microservices.bill;

import lombok.AllArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.List;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;

@Service
@Transactional
@AllArgsConstructor
public class BillService {
  private final BillRepository billRepository;

  public void createBill(Integer tableId, Integer orderId) {
    Bill bill = new Bill();
    bill.setTableId(tableId);
    bill.setOrderId(orderId);
    billRepository.save(bill);
  }

  public void payBills(Integer tableId) {
    List<Bill> bills = billRepository.findAllByTableId(tableId);
    if (bills.isEmpty()) {
      throw new EntityNotFoundException("Bills not found");
    }
    billRepository.delete(bills);
  }
}
