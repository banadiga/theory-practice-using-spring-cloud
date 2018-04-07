package com.ogasimov.labs.springcloud.microservices.event;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.cloud.bus.event.UnknownRemoteApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Slf4j
@RequiredArgsConstructor
@Component
public class UnknownEventListener implements ApplicationListener<UnknownRemoteApplicationEvent> {

  private final EventService eventService;

  @Override
  public void onApplicationEvent(UnknownRemoteApplicationEvent unknownRemoteApplicationEvent) {
    log.info("UnknownRemoteApplicationEvent : {}", unknownRemoteApplicationEvent);
    try {
      eventService.persistEvent(unknownRemoteApplicationEvent);
    } catch (Exception e) {
      log.error("Can not parse event. Exception:", e);
    }
  }
}
