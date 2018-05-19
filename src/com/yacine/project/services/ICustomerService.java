package com.yacine.project.services;

import com.yacine.project.entities.Customer;

import java.util.List;

/**
 * Created by WozenGeek on 19/05/2018.
 */
public interface ICustomerService {
    
    Customer add(Customer c);

    List<Customer> getAll();

    Customer getById(Integer id);
}
