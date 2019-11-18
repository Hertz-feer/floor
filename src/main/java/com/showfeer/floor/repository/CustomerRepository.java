package com.showfeer.floor.repository;

import com.showfeer.floor.pojo.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {

    @Modifying
    @Transactional
    @Query("update Customer  set name = :#{#customer.name}," +
            "phone=:#{#customer.phone}," +
            "sex=:#{#customer.sex}," +
            "area=:#{#customer.area}," +
            "account=:#{#customer.account}," +
            "ask=:#{#customer.ask} where id = :#{#customer.id}")
    Integer updateCustomer(@Param("customer") Customer customer);
}
