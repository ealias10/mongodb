package com.example.mogodb.service;


import com.example.mogodb.dao.UserDao;
import com.example.mogodb.mapper.UserMapper;
import com.example.mogodb.modal.Users;
import com.example.mogodb.repositery.UsersRepositery;
import com.example.mogodb.request.UserRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserDao userDao;
    public Object createUser(UserRequest request)
    {
        Users users= UserMapper.createUser(request);
        return userDao.save(users);
    }

    public Object userByName(UserRequest request)
    {
        return userDao.userByName(request.getName(),request.getRole());
    }


}
