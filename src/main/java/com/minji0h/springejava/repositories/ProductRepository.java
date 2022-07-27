package com.minji0h.springejava.repositories;

import com.minji0h.springejava.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
