package com.ogasimov.labs.springcloud.microservices.event;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.ogasimov.labs.springcloud.microservices.common.EventDto;

@RestController
public class EventController {
  @Autowired
  private EventService eventService;

  @GetMapping("/events/{startId}/{count}")
  public List<EventDto> getEvents(@PathVariable("startId") Integer startId, @PathVariable("count") Integer count) {
  }
}
