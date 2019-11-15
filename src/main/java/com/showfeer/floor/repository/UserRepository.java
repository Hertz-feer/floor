package com.showfeer.floor.repository;

import com.showfeer.floor.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {

    User findByAccountAndPassword(String account,String password);
}
