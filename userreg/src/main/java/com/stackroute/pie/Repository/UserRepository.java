package com.stackroute.pie.Repository;

import com.stackroute.pie.Model.Request;
import com.stackroute.pie.Model.User;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends MongoRepository<User,Long> {
    Optional<User> findByUsername(String username);
    Boolean existsByUsername(String username);
    Boolean existsByEmail(String email);
    public boolean existsByInsuredId(int userId);
    public Optional<User> findByInsuredId(int userId);
}
