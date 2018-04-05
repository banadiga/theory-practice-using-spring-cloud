package com.ogasimov.labs.springcloud.microservices.bill;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BillRepository extends JpaRepository<Bill, Integer> {
  List<Bill> findAllByTableId(Integer tableId);
}
