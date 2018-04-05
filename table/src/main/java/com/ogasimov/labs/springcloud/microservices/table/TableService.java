package com.ogasimov.labs.springcloud.microservices.table;

import lombok.AllArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;

@Service
@Transactional
@AllArgsConstructor
public class TableService {
  private final TableRepository tableRepository;

  public List<Integer> getTableIds() {
    return tableRepository.findAll()
        .stream()
        .map(Table::getId)
        .collect(Collectors.toList());
  }

  public List<Integer> getFreeTableIds() {
    return tableRepository.findAllByFree(Boolean.TRUE)
        .stream()
        .map(Table::getId)
        .collect(Collectors.toList());
  }

  public void updateTable(Integer id, boolean isFree) {
    Table table = tableRepository.findOne(id);
    if (table == null) {
      throw new EntityNotFoundException("Table not found");
    }
    table.setFree(isFree);
    tableRepository.save(table);
  }

}
