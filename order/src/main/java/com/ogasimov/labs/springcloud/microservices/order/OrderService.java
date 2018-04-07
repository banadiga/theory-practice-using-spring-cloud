package com.ogasimov.labs.springcloud.microservices.order;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class OrderService {
  private final OrderRepository orderRepository;
  private final StockClient stockClient;
  private final BillClient billClient;
  private final MenuService menuService;

  public Integer createOrder(Integer tableId, List<Integer> menuItems) {
    Set<Integer> allMenuItemsExist = menuService.getMenuItems().keySet();

    Optional<Integer> notExistMenuItem = menuItems.stream()
        .filter(item -> !allMenuItemsExist.contains(item))
        .findAny();

    notExistMenuItem.ifPresent(item -> {
      throw new EntityNotFoundException("Mnu items not found: " + item);
    });

    Order order = new Order();
    order.setTableId(tableId);
    orderRepository.save(order);

    final Integer orderId = order.getId();
    stockClient.minusFromStock(menuItems);
    billClient.createBill(tableId, orderId);

    return orderId;
  }
}
