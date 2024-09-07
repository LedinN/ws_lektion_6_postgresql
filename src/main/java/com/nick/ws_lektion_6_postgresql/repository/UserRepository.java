package com.nick.ws_lektion_6_postgresql.repository;

import com.nick.ws_lektion_6_postgresql.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface UserRepository extends JpaRepository<User, Long> {
}
