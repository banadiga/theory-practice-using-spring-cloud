package com.ogasimov.labs.springcloud.microservices.table;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TableRepository extends JpaRepository<Table, Integer> {
  List<Table> findAllByFree(Boolean free);
}
