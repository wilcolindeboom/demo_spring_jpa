package nl.eshuis.demo_spring_jpa.service;

import nl.eshuis.demo_spring_jpa.model.Order;

import java.util.List;

public interface OrderService {

    List<Order> getAllOrders();
}
