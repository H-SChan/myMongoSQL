package com.example.multiple_datebases2.repository.mysql;

import com.example.multiple_datebases2.model.mysql.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
