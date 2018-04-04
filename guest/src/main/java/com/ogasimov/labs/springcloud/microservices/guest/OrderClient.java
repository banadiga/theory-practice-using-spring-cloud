package com.ogasimov.labs.springcloud.microservices.guest;

import java.util.List;

public interface OrderClient {
  Integer createOrder(Integer tableId, List<Integer> menuItems);
}
