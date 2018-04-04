package com.ogasimov.labs.springcloud.microservices.stock;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockRepository extends JpaRepository<Stock, Integer> {
  Stock findOneByMenuItemId(Integer menuItemId);
}
