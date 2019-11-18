package com.showfeer.floor.controller;

import com.showfeer.floor.pojo.Customer;
import com.showfeer.floor.pojo.CustomerChild;
import com.showfeer.floor.pojo.District;
import com.showfeer.floor.service.impl.CustomerServiceImpl;
import com.showfeer.floor.service.impl.DistrictServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CustomersController {

    @Resource
    private CustomerServiceImpl customerService;
    @Resource
    private DistrictServiceImpl districtService;

    @GetMapping("/customers")  //跳转到列表
    public String findAll(Model model){
        List<CustomerChild> list = new ArrayList<>();
        List<Customer> ls = customerService.selectAll();
        for(Customer customer:ls){
            CustomerChild customerChild = new CustomerChild();
            District district = districtService.selectById(customer.getArea());
            customerChild.setDistrict(district);  //1
            customerChild.setCreat_time(customer.getCreat_time()); //2
            customerChild.setFrequency(customer.getFrequency());  //3
            customerChild.setArea(customer.getArea());  //4
            customerChild.setVolume(customer.getVolume());  //5
            customerChild.setAsk(customer.getAsk());  //6
            customerChild.setAccount(customer.getAccount());  //7
            customerChild.setName(customer.getName());  //8
            customerChild.setPhone(customer.getPhone());  //9
            customerChild.setId(customer.getId());
            customerChild.setSex(customer.getSex());
            list.add(customerChild);
        }
        model.addAttribute("customers",list);
        return "/customer/list";
    }

    @GetMapping("/customer")   //跳转到添加页面
    public String toAddCustomer(Model model){
        List<District> districts = districtService.selectByPid(1);
        model.addAttribute("districts",districts);
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
        List<District> districts = districtService.selectByPid(1);
        model.addAttribute("customer",customer);
        model.addAttribute("districts",districts);
        return "/customer/update";
    }

    @PutMapping("/customer")   //修改请求
    public String updateCustomer(Customer customer,Model model){
        System.out.println(customer);
        Integer back = customerService.updateCustomer(customer);
        if(back != 0){
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
