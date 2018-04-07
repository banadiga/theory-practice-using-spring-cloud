package com.ogasimov.labs.springcloud.microservices.event;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import com.ogasimov.labs.springcloud.microservices.common.EmptyStockCommand;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Slf4j
@RequiredArgsConstructor
@Component
public class EmptyStockEventListener implements ApplicationListener<EmptyStockCommand> {

  private final EventService eventService;

  @Override
  public void onApplicationEvent(EmptyStockCommand emptyStockCommand) {
    log.info("Item out of stock: " + emptyStockCommand.getMenuItem());
    Event event = Event.builder()
        .type(emptyStockCommand.getClass().getName())
        .payload(emptyStockCommand.getMenuItem())
        .build();
    eventService.save(event);
  }
}
