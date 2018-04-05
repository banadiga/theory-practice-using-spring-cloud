package com.ogasimov.labs.springcloud.microservices.event;

import com.ogasimov.labs.springcloud.microservices.common.EventDto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EventController {
  private EventService eventService;

  @GetMapping("/events/{startId}/{count}")
  public List<EventDto> getEvents(@PathVariable("startId") Integer startId, @PathVariable("count") Integer count) {
  }
}
