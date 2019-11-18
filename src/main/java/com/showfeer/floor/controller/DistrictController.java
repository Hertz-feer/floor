package com.showfeer.floor.controller;

import com.showfeer.floor.pojo.District;
import com.showfeer.floor.repository.DistrictRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class DistrictController {

    @Resource
    private DistrictRepository districtRepository;

    @RequestMapping("/a")
    public String show(Model model){
        List<District> list = districtRepository.findByPid(1);
        model.addAttribute("districts",list);
        return "demo";
    }

    @RequestMapping("/show")
    @ResponseBody
    public List<District> showChild(Integer pid){
        List<District> list = districtRepository.findByPid(pid);
        return list;
    }
    @RequestMapping("/text")
    @ResponseBody
    public List<District> test(){
        List<District> list = districtRepository.findByPid(150);
        return list;
    }
}
