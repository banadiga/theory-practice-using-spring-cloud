package com.ogasimov.labs.springcloud.microservices.stock;

import lombok.AllArgsConstructor;

import java.util.List;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
@AllArgsConstructor
public class StockService {
  private final StockRepository stockRepository;

  public void minusFromStock(List<Integer> menuItems) {
    menuItems.forEach(menuItemId -> {
      Stock stock = stockRepository.findOneByMenuItemId(menuItemId);
      if (stock == null) {
        throw new EntityNotFoundException("Stock not found: " + menuItemId);
      }
      if (stock.getCount() == 0) {
        throw new EntityNotFoundException("Stock empty: " + menuItemId);
      }
      stock.setCount(stock.getCount() - 1);
      stockRepository.save(stock);
    });

  }
}
