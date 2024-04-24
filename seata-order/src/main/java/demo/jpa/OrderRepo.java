package demo.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.model.Order;

public interface OrderRepo extends JpaRepository<Order, Long> {
}
