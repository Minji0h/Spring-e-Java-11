package com.minji0h.springejava.repositories;

import com.minji0h.springejava.entities.Order;
import com.minji0h.springejava.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
