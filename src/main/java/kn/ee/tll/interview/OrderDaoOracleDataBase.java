package kn.ee.tll.interview;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Collections;

@Repository
public class OrderDaoOracleDataBase {

  public Collection<OrderEntity> getOrders() {
    // assume DB fetching properly implemented here
    return Collections.EMPTY_LIST;
  }

  public Collection<OrderEntity> getOrdersByNumber(String number) {
    // assume DB fetching properly implemented here
    return Collections.EMPTY_LIST;
  }

  public Collection<OrderEntity> getOrdersTharRequireDelivery() {
    // assume DB fetching properly implemented here
    return Collections.EMPTY_LIST;
  }
}
