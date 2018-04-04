package com.ogasimov.labs.springcloud.microservices.order;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class OrderService {
  @Autowired
  private OrderRepository orderRepository;

  @Autowired
  private StockClient stockClient;

  @Autowired
  private BillClient billClient;

  public Integer createOrder(Integer tableId, List<Integer> menuItems) {
    Order order = new Order();
    order.setTableId(tableId);
    orderRepository.save(order);

    final Integer orderId = order.getId();
    stockClient.minusFromStock(menuItems);
    billClient.createBill(tableId, orderId);

    return orderId;
  }
}
