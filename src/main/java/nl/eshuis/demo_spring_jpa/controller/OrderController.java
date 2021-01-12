package nl.eshuis.demo_spring_jpa.controller;

import nl.eshuis.demo_spring_jpa.model.Order;
import nl.eshuis.demo_spring_jpa.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderservice;

    @GetMapping(value = "/orders")
    public ResponseEntity<Object> getOrders() {
        List<Order> orders = orderservice.getAllOrders();
        return new ResponseEntity<>(orders, HttpStatus.OK);
    }




}
