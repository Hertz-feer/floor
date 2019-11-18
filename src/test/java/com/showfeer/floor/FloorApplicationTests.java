package com.showfeer.floor;

import com.showfeer.floor.pojo.Customer;
import com.showfeer.floor.pojo.District;
import com.showfeer.floor.repository.CustomerRepository;
import com.showfeer.floor.repository.DistrictRepository;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class FloorApplicationTests {

    @Resource
    private DistrictRepository districtRepository;
    @Resource
    private CustomerRepository customerRepository;
    @Test
    void contextLoads() {
        List<District> list =  districtRepository.findByPid(150);
        for(District dd:list){
            System.out.println(dd.toString());
        }
    }
    @Test
    void customerTest(){
        Customer customer = new Customer();
        customer.setId(7);
        customer.setName("啦啦啦");
        customer.setPhone(12345L);
        customer.setSex("女");
        customer.setArea(1166);
        customer.setAccount("拉啊啦啦");
        customer.setAsk("lululu");
        customerRepository.updateCustomer(customer);
    }

}
