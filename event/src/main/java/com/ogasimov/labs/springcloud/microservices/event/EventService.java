package com.ogasimov.labs.springcloud.microservices.event;

import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class EventService {
  public void persistEvent(Object payload) throws Exception {
    Event event = new Event();
    event.setPayload(objectMapper.writeValueAsString(payload));
    event.setType(payload.getClass().getName());
    eventRepository.save(event);
  }
}
