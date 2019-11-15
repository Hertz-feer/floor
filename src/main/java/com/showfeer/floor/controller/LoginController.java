package com.showfeer.floor.controller;

import com.showfeer.floor.pojo.User;
import com.showfeer.floor.service.impl.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class LoginController {

    @Resource
    private UserServiceImpl userService;
    @PostMapping("/user/login")
    @ResponseBody
    public String login(String username, String password, Model model){
        User user = userService.queryUser(username,password);
        if(user != null){
            return "success";
        }else {
            model.addAttribute("msg","账号或密码错误");
            return "login";
        }

    }
}
