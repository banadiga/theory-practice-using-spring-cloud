package com.ogasimov.labs.springcloud.microservices.event;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Slf4j
@RequiredArgsConstructor
@RestController
public class EventController {
  private final EventService eventService;

  @GetMapping("/")
  @HystrixCommand
  public void index() {
    log.info("Event index");
  }

  @GetMapping("/events")
  public List<EventDto> getEvents() {
    return eventService.getEvents().stream()
        .map(EventDto::new)
        .collect(toList());
  }
}
