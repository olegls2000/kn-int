package kn.ee.tll.interview;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

// ?
@Repository
public class OrderDaoInMemory {

  private Set<OrderEntity> orders = new HashSet<>();

  public Collection<OrderEntity> getOrders() {
    return orders;
  }

  public void save(OrderEntity order) {
    //?
    orders.add(order);
  }

  public void update(OrderEntity order) {
   // how to make an update?
  }

  //?
  public Collection<OrderEntity> getOrdersThatRequireDelivery() {
    return orders.stream()
        .filter(order -> order.isRequiresDelivery() == true)
        .collect(Collectors.toList());
  }
}
