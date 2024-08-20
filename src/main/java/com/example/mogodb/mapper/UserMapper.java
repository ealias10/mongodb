package com.example.mogodb.mapper;

import com.example.mogodb.modal.Roles;
import com.example.mogodb.modal.Users;
import com.example.mogodb.request.UserRequest;

import java.util.UUID;

public class UserMapper {

    public static Users createUser(UserRequest request)
    {
        return Users.builder().id(UUID.randomUUID()).name(request.getName()).roles(Roles.builder().id(UUID.randomUUID()).role(request.getRole()).build()).build();
    }
}
