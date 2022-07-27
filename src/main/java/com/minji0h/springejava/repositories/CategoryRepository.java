package com.minji0h.springejava.repositories;

import com.minji0h.springejava.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
