package com.showfeer.floor.service.impl;

import com.showfeer.floor.pojo.User;
import com.showfeer.floor.repository.UserRepository;
import com.showfeer.floor.service.UserService;
import com.showfeer.floor.util.Result;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserRepository userRepository;

    @Override
    public Result saveUser(User user) {
        Result result = new Result();
        User saveUser = userRepository.save(user);
        if(saveUser != null){
            result.setStyle(200);
        }
        return result;
    }

    @Override
    public int modifyUser(User user) {
        return 0;
    }

    @Override
    public User queryUser(Integer account, Integer password) {
        return null;
    }

    @Override
    public int deleteUser(int id) {
        return 0;
    }

    @Override
    public User queryUserByAccount(Integer account) {
        return null;
    }
}
