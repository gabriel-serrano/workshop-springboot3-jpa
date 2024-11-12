package br.com.gabrielserrano.course.repositories;

import br.com.gabrielserrano.course.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
