package com.ogasimov.labs.springcloud.microservices.event;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class EventDto {
  private Integer id;
  private String type;

  public EventDto(Event event) {
    id = event.getId();
    type = event.getType();
  }
}
