package com.example.admin.repository;

import com.example.admin.model.Admin;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AdminRepository extends MongoRepository<Admin,Integer> {
}
