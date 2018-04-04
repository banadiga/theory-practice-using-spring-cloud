package com.ogasimov.labs.springcloud.microservices.table;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "tables")
public class Table {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private Boolean free;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Boolean isFree() {
    return free;
  }

  public void setFree(Boolean free) {
    this.free = free;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Table table = (Table) o;

    if (id != null ? !id.equals(table.id) : table.id != null) return false;
    return free != null ? free.equals(table.free) : table.free == null;
  }

  @Override
  public int hashCode() {
    int result = id != null ? id.hashCode() : 0;
    result = 31 * result + (free != null ? free.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "Table{" +
           "id=" + id +
           ", free=" + free +
           '}';
  }
}
