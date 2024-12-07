package com.klef.jfsd.exam.service;

import com.klef.jfsd.exam.model.Customer;

public interface CustomerService {
    Customer updateCustomer(Long id, String name, String address);
}
