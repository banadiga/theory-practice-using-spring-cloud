package com.ogasimov.labs.springcloud.microservices.order;

import lombok.AllArgsConstructor;

import java.util.Map;
import java.util.stream.Collectors;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
@AllArgsConstructor
public class MenuService {
  private final MenuItemRepository menuItemRepository;

  public Map<Integer, String> getMenuItems() {
    return menuItemRepository.findAll()
        .stream()
        .collect(Collectors.toMap(MenuItem::getId, MenuItem::getName));
  }
}
