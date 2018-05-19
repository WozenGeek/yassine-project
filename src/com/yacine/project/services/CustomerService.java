package com.yacine.project.services;

import com.yacine.project.DAO.CustomerDAO;
import com.yacine.project.DAO.ICustomerDao;
import com.yacine.project.entities.Customer;

import java.util.List;

/**
 * Created by WozenGeek on 19/05/2018.
 */
public class CustomerService implements ICustomerService {

    private ICustomerDao customerDao = new CustomerDAO();

    @Override
    public Customer add(Customer c) {
        return customerDao.add(c);
    }

    @Override
    public List<Customer> getAll() {
        return customerDao.getAll();
    }

    @Override
    public Customer getById(Integer id) {
        return customerDao.getById(id);
    }
}
