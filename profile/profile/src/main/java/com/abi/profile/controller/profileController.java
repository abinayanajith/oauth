package com.abi.profile.controller;

import com.abi.commons.model.Customer;
import com.abi.profile.service.CustomerService;
import com.abi.profile.service.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/services")
public class profileController {

    @Autowired
    CustomerService customerService;

    @RequestMapping(value = "/profile",method = RequestMethod.POST)
    //@PreAuthorized("hasAuthority('create_profile')")
    public Customer save(@RequestBody Customer customer){
        return customerService.save(customer);
    }

//    @RequestMapping(value = "/profile", method = RequestMethod.GET)
    //@PreAuthorized("hasAuthority('read_profile')")
//    public Customer fetch(@RequestParam int profileId){
//        return customerService.fetchById(profileId);
//    }
    //best practice for retrieveing a customer is to go through path param instead of query parameters
     @RequestMapping(value = "/customers/{id}", method = RequestMethod.GET)
     @PreAuthorized("hasAuthority('read_profile')")
     public Customer fetch(@PathVariable(value = "id") int customerId){
         return customerService.fetchById(profileId);
     }

//
//    @RequestMapping(value = "/profiles",method = RequestMethod.GET)
    //@PreAuthorized("hasRole('ROLE_operator')")
//    public List<Customer> fetch(){
//        return customerService.fetchAllProfiles();
//    }
}
