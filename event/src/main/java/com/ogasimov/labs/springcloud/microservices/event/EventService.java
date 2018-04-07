package com.ogasimov.labs.springcloud.microservices.event;

import lombok.RequiredArgsConstructor;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.stereotype.Service;

import java.util.List;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class EventService {
  private final EventRepository eventRepository;
  private final ObjectMapper objectMapper;

  public Event save(Event event) {
    return eventRepository.save(event);
  }

  public List<Event> getEvents() {
    return eventRepository.findAll();
  }

  public void persistEvent(Object payload) throws Exception {
    Event event = new Event();
    event.setPayload(objectMapper.writeValueAsString(payload));
    event.setType(payload.getClass().getName());
    eventRepository.save(event);
  }
}
