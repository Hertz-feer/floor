package com.showfeer.floor.service.impl;

import com.showfeer.floor.pojo.Customer;
import com.showfeer.floor.repository.CustomerRepository;
import com.showfeer.floor.service.CustomerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Resource
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> selectAll() {
        return customerRepository.findAll();

    }

    @Override
    public Integer updateCustomer(Customer customer) {
        return customerRepository.updateCustomer(customer);
    }

    @Override
    public void deleteById(Integer id) {
        customerRepository.deleteById(id);
    }

    @Override
    public Customer selectById(Integer id) {
        return customerRepository.findById(id).get();
    }

    @Override
    public Customer addCustomer(Customer customer) {
        customer.setCreat_time(new Date());
        customer.setVolume(0.0);
        customer.setFrequency(0);
        return  customerRepository.save(customer);
    }
}
