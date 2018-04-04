package com.ogasimov.labs.springcloud.microservices.event;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<Event, Integer> {
  List<Event> findAllByIdBetween(Integer startId, Integer endId);
}
