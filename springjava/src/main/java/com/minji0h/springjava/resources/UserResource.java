package com.minji0h.springjava.resources;

import com.minji0h.springjava.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
    @GetMapping
        public ResponseEntity<User> findAll(){
            User u = new User(1L,"Maria", "maria@teste", "1198222", "maria21");
            return ResponseEntity.ok().body(u);

        }
}
