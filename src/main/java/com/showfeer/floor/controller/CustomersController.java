package com.showfeer.floor.controller;

import com.showfeer.floor.pojo.Customer;
import com.showfeer.floor.service.impl.CustomerServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class CustomersController {

    @Resource
    private CustomerServiceImpl customerService;

    @GetMapping("/customers")  //跳转到列表
    public String findAll(Model model){
        List list = customerService.selectAll();
        model.addAttribute("customers",list);
        return "/customer/list";
    }

    @GetMapping("/customer")   //跳转到修改页面
    public String toAddCustomer(){
        return "/customer/add";
    }

    @PostMapping("/customer")   //添加请求
    public String addCustomer(Customer customer,Model model){
        Customer back =customerService.addCustomer(customer);
        if(back == null){
            model.addAttribute("msg","添加失败");
            return "/customer/add";
        }else{
            return "redirect:/customers";
        }
    }

    @GetMapping("/customer/{id}")   //跳转到修改页面
    public String toEditCustomer(@PathVariable Integer id,Model model){
        Customer customer = customerService.selectById(id);
        model.addAttribute("customer",customer);
        return "/customer/update";
    }

    @PutMapping("/customer")   //修改请求
    public String updateCustomer(Customer customer,Model model){
        Customer back = customerService.updateCustomer(customer);
        if(back != null){
            return "redirect:/customers";
        }else{
            model.addAttribute("msg","修改失败");
            return "redirect:/customer/"+customer.getId().toString();
        }
    }

    @DeleteMapping("/customer/{id}")
    public String deleteCustomer(@PathVariable("id") Integer id){
        customerService.deleteById(id);
        return "redirect:/customers";
    }

}
