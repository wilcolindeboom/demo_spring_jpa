package nl.eshuis.demo_spring_jpa.repository;


import nl.eshuis.demo_spring_jpa.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {



}
