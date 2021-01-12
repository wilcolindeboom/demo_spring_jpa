package nl.eshuis.demo_spring_jpa.service;

import nl.eshuis.demo_spring_jpa.model.Order;
import nl.eshuis.demo_spring_jpa.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderrepository;

    @Override
    public List<Order> getAllOrders() {
        return orderrepository.findAll();
    }
}
