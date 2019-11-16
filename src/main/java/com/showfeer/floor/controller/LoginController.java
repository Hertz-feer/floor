package com.showfeer.floor.controller;

import com.showfeer.floor.pojo.User;
import com.showfeer.floor.service.impl.UserServiceImpl;
import com.showfeer.floor.util.JwtUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    @Resource
    private UserServiceImpl userService;
    @PostMapping("/user/login")
    public String login(String account,
                        String password,
                        Model model,
                        HttpSession session){
        User user = userService.queryUser(account,password);
        if(user != null){
            session.setAttribute("token",JwtUtil.createJwt(account));
            session.setAttribute("loginUser",user.getName());
            return "redirect:/main.html";
        }else {
            model.addAttribute("msg","账号或密码错误");
            return "login";
        }

    }
}
