package com.example.mogodb.repositery;

import com.example.mogodb.modal.Users;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;


import java.util.List;
import java.util.UUID;


public interface UsersRepositery  extends MongoRepository<Users, UUID> {



    @Query("{ 'name' : ?0 },{'role':?1}")
    List<Users> UserByName(String name,String role);
}
