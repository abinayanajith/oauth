package com.abi.profile.service;

import com.abi.commons.model.Customer;
import com.abi.profile.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    CustomerRepository repo;

    @Override
    public Customer save(Customer customer) {
        return repo.save(customer);
    }
}
