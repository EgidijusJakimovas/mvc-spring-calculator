package com.spring.calculator.repository;

import com.spring.calculator.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

    @Query("SELECT u FROM User u WHERE u.id = :id")

    User findById(int id);

    User findByEmail(String email);

    User findByUsername(String username);
}
