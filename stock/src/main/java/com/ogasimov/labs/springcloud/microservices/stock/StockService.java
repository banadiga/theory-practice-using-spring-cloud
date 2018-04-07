package com.ogasimov.labs.springcloud.microservices.stock;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import com.ogasimov.labs.springcloud.microservices.common.EmptyStockCommand;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import java.util.List;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;

@Slf4j
@Service
@Transactional
@RequiredArgsConstructor
public class StockService {
  private final StockRepository stockRepository;
  private final ApplicationContext context;

  public void minusFromStock(List<Integer> menuItems) {
    menuItems.forEach(menuItemId -> {
      Stock stock = stockRepository.findOneByMenuItemId(menuItemId);
      if (stock == null) {
        throw new EntityNotFoundException("Stock not found: " + menuItemId);
      }
      if (stock.getCount() == 0) {
        EmptyStockCommand emptyStockCommand = new EmptyStockCommand(this, context.getId(), menuItemId.toString());
        log.info("New event {}", emptyStockCommand);
        context.publishEvent(emptyStockCommand);
        throw new EntityNotFoundException("Stock empty: " + menuItemId);
      }
      stock.setCount(stock.getCount() - 1);
      stockRepository.save(stock);
    });

  }
}
