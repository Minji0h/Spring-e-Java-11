package com.minji0h.springejava.repositories;

import com.minji0h.springejava.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
