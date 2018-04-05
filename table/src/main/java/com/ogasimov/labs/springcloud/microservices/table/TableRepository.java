package com.ogasimov.labs.springcloud.microservices.table;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TableRepository extends JpaRepository<Table, Integer> {
  List<Table> findAllByFree(Boolean free);
}
