package kn.ee.tll.interview;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

// Where to put validator?
@Service
public class OrderService {

  // ?
  @Autowired
  // ?
  OrderDaoInMemory orderDao;

  // @Autowired OrderDaoOracleDataBase orderDao;

  OrderEntity create(OrderEntity order) {
    orderDao.save(order);

    return order;
  }

  OrderEntity update(OrderEntity order) {
    orderDao.save(order);

    return order;
  }

  Collection<OrderEntity> getOrders() {
    return orderDao.getOrders();
  }

  Collection<OrderEntity> getOrdersWithDelivery() {
    return orderDao.getOrdersThatRequireDelivery();
  }
}
