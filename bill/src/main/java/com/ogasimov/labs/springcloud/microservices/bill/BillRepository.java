package com.ogasimov.labs.springcloud.microservices.bill;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillRepository extends JpaRepository<Bill, Integer> {
  List<Bill> findAllByTableId(Integer tableId);
}
