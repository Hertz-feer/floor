package com.showfeer.floor.service;

import com.showfeer.floor.pojo.Customer;

import java.util.List;

public interface CustomerService {

    /**
     * 查询所有客户
     * @return
     */
    List<Customer> selectAll();

    /**
     * 添加客户
     * @param customer
     * @return
     */
    Customer addCustomer(Customer customer);
    /**
     * 修改客户
     * @param customer
     * @return
     */
    Customer updateCustomer(Customer customer);

    /**
     * 按照ID查询客户
     * @param id
     * @return
     */
    Customer selectById(Integer id);

    /**
     * 通过id删除
     * @param id
     * @return
     */
    void deleteById(Integer id);
}
