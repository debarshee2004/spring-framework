package com.debarshee.spring_boot_security.repository;

import com.debarshee.spring_boot_security.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);

}
