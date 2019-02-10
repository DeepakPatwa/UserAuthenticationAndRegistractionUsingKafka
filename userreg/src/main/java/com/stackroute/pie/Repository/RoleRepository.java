package com.stackroute.pie.Repository;

import com.stackroute.pie.Model.Role;
import com.stackroute.pie.Model.RoleName;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends MongoRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
}