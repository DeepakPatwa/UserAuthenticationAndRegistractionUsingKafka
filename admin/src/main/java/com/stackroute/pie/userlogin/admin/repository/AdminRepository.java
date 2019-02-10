package com.stackroute.pie.userlogin.admin.repository;

import com.stackroute.pie.userlogin.admin.domain.FormFormat;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends MongoRepository<FormFormat, Integer> {
}
