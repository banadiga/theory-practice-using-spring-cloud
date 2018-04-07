package com.ogasimov.labs.springcloud.microservices.order;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class MenuService {
  private final MenuItemRepository menuItemRepository;

  public Map<Integer, String> getMenuItems() {
    return menuItemRepository.findAll()
        .stream()
        .collect(Collectors.toMap(MenuItem::getId, MenuItem::getName));
  }
}
