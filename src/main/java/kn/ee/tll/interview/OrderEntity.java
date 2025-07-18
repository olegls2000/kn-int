package kn.ee.tll.interview;

import jakarta.persistence.*;

@Table("kn_order")
@Entity
public class OrderEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "order_number")
  private String orderNumber;

  // ?
  @Column(name = "user_first_name")
  private String userFirstName;

  @Column(name = "user_last_name")
  private String userLastName;

  @Column(name = "user_email")
  private String userEmail;

  @Column(name = "user_phone")
  private String userPhone;

  @Column(name = "requires_delivery")
  private boolean requiresDelivery;

  @Column(name = "delivery_address")
  private String delivery_address;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getOrderNumber() {
    return orderNumber;
  }

  public void setOrderNumber(String orderNumber) {
    this.orderNumber = orderNumber;
  }

  public String getUserFirstName() {
    return userFirstName;
  }

  public void setUserFirstName(String userFirstName) {
    this.userFirstName = userFirstName;
  }

  public String getUserLastName() {
    return userLastName;
  }

  public void setUserLastName(String userLastName) {
    this.userLastName = userLastName;
  }

  public String getUserEmail() {
    return userEmail;
  }

  public void setUserEmail(String userEmail) {
    this.userEmail = userEmail;
  }

  public String getUserPhone() {
    return userPhone;
  }

  public void setUserPhone(String userPhone) {
    this.userPhone = userPhone;
  }

  public boolean isRequiresDelivery() {
    return requiresDelivery;
  }

  public void setRequiresDelivery(boolean requiresDelivery) {
    this.requiresDelivery = requiresDelivery;
  }

  public void setDeliveryAddress(String delivery_address) {
    this.delivery_address = delivery_address;
  }
}
