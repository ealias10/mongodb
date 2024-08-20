package com.example.mogodb.dao;

import com.example.mogodb.modal.Users;
import com.example.mogodb.repositery.UsersRepositery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDao {
    @Autowired
    UsersRepositery usersRepositery;

    public Users save(Users users)
    {
        return usersRepositery.save(users);
    }

    public List<Users> userByName(String name,String role)
    {
        return usersRepositery.UserByName(name,role);
    }


}
