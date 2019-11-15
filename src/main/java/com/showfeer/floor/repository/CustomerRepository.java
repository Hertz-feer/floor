package com.showfeer.floor.repository;

import com.showfeer.floor.pojo.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
