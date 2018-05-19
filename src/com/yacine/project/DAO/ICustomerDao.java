package com.yacine.project.DAO;

import com.yacine.project.entities.Customer;

import java.util.List;

/**
 * Created by WozenGeek on 19/05/2018.
 */
public interface ICustomerDao {
    Customer add(Customer c);

    List<Customer> getAll();
    Customer getById(Integer id);
}
