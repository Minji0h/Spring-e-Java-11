package com.minji0h.springejava.repositories;

import com.minji0h.springejava.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
