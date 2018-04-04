package com.ogasimov.labs.springcloud.microservices.event;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "events")
public class Event {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private String payload;
  private String type;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getPayload() {
    return payload;
  }

  public void setPayload(String payload) {
    this.payload = payload;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Event event = (Event) o;

    if (id != null ? !id.equals(event.id) : event.id != null) return false;
    if (payload != null ? !payload.equals(event.payload) : event.payload != null) return false;
    return type != null ? type.equals(event.type) : event.type == null;
  }

  @Override
  public int hashCode() {
    int result = id != null ? id.hashCode() : 0;
    result = 31 * result + (payload != null ? payload.hashCode() : 0);
    result = 31 * result + (type != null ? type.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "Event{" +
           "id=" + id +
           ", payload='" + payload + '\'' +
           ", type='" + type + '\'' +
           '}';
  }
}
