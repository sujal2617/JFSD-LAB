package com.klef.jfsd.exam.controller;

import com.klef.jfsd.exam.model.Customer;
import com.klef.jfsd.exam.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PutMapping("/{id}")
    public Customer updateCustomer(@PathVariable Long id, 
                                   @RequestParam String name, 
                                   @RequestParam String address) {
        return customerService.updateCustomer(id, name, address);
    }
}
