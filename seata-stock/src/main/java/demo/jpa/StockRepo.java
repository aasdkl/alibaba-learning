package demo.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.model.Stock;

public interface StockRepo extends JpaRepository<Stock, Long> {
}
