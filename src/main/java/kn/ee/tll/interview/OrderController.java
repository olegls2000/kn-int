package kn.ee.tll.interview;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class OrderController {

  // ?
  @Autowired public OrderService orderService;

  // ?
  @GetMapping("/orders")
  public Collection<OrderEntity> getOrders() {

    return orderService.getOrders();
  }

  @GetMapping("/orders/with-delivery")
  public Collection<OrderEntity> getOrdersWithDelivery() {

    return orderService.getOrdersWithDelivery();
  }

  // ?
  @GetMapping("/orders/create")
  public OrderEntity createOrder(
      @RequestParam String orderNumber,
      @RequestParam String userFirstName,
      @RequestParam String userLastName,
      @RequestParam String userEmail,
      @RequestParam String userPhone,
      @RequestParam boolean requiresDelivery,
      @RequestParam String deliveryAddress) {

    final var orderEntity = new OrderEntity();
    orderEntity.setOrderNumber(orderNumber);
    orderEntity.setUserFirstName(userFirstName);
    orderEntity.setUserLastName(userLastName);
    orderEntity.setUserEmail(userEmail);
    orderEntity.setUserPhone(userPhone);
    orderEntity.setRequiresDelivery(requiresDelivery);
    orderEntity.setDeliveryAddress(deliveryAddress);

    orderService.create(orderEntity);
    return orderEntity;
  }

  // ?
  @GetMapping("/orders/update")
  public OrderEntity updateOrder(
      @RequestParam Long id,
      @RequestParam String orderNumber,
      @RequestParam String userFirstName,
      @RequestParam String userLastName,
      @RequestParam String userEmail,
      @RequestParam String userPhone,
      @RequestParam boolean requiresDelivery,
      @RequestParam String deliveryAddress) {
//?
    final var orderEntity = new OrderEntity();
    orderEntity.setId(id);
    orderEntity.setOrderNumber(orderNumber);
    orderEntity.setUserFirstName(userFirstName);
    orderEntity.setUserLastName(userLastName);
    orderEntity.setUserEmail(userEmail);
    orderEntity.setUserPhone(userPhone);
    orderEntity.setRequiresDelivery(requiresDelivery);
    orderEntity.setDeliveryAddress(deliveryAddress);
    orderService.update(orderEntity);

    return orderEntity;
  }
}
