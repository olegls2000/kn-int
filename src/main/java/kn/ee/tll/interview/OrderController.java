package kn.ee.tll.interview;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class OrderController {

  @Autowired
  public OrderController(OrderService orderService) {
    this.orderService = orderService;
  }

  private final OrderService orderService;

  // ?
  @GetMapping("/orders")
  public Collection<OrderEntity> getOrders() {

    return orderService.getOrders();
  }

  // ?
  @GetMapping("/orders/create")
  public OrderEntity createOrder(
      @RequestParam String orderNumber,
      @RequestParam String userFirstName,
      @RequestParam String userLastName,
      @RequestParam String userEmail,
      @RequestParam String userPhone,
      @RequestParam String deliveryAddress) {

    final var orderEntity = new OrderEntity();
    orderEntity.setOrderNumber(orderNumber);
    orderEntity.setUserFirstName(userFirstName);
    orderEntity.setUserLastName(userLastName);
    orderEntity.setUserEmail(userEmail);
    orderEntity.setUserPhone(userPhone);
    // ?
    orderEntity.setRequiresDelivery(true);
    orderEntity.setDeliveryAddress(deliveryAddress);

    orderService.create(orderEntity);
    return orderEntity;
  }

  // ?
  @GetMapping("/orders/update")
  public OrderEntity updateOrder(
      @RequestParam Long id,
      @RequestParam(required = false) String orderNumber,
      @RequestParam(required = false) String userFirstName,
      @RequestParam(required = false) String userLastName,
      @RequestParam(required = false) String userEmail,
      @RequestParam(required = false) String userPhone,
      // ?
      @RequestParam boolean requiresDelivery,
      @RequestParam String deliveryAddress) {
    // ?
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

  // ? * is it possible to improve?
  @GetMapping("/orders/with-delivery")
  public Collection<OrderEntity> getOrdersWithDelivery() {

    return orderService.getOrdersWithDelivery();
  }
}
