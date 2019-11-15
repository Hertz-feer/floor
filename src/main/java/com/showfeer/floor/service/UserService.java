package com.showfeer.floor.service;

import com.showfeer.floor.pojo.User;
import com.showfeer.floor.util.Result;

public interface UserService {

    /**
     * 创建用户
     * @param user
     * @return
     */
    Result saveUser(User user);

    /**
     * 修改用户
     * @param user
     * @return
     */
    int modifyUser(User user);

    /**
     * 更具用户名和密码查询用户
     * @param account
     * @param password
     * @return
     */
    User queryUser(String account,String password);

    /**
     * 更具Id删除用户
     * @param id
     * @return
     */
    int deleteUser(int id);

    /**
     * 更具用户名查询用户
     * @param account
     * @return
     */
    User queryUserByAccount(Integer account);
}
