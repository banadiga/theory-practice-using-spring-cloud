package com.ogasimov.labs.springcloud.microservices.event;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ogasimov.labs.springcloud.microservices.common.EventDto;

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
