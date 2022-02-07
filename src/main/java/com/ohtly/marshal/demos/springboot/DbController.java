package com.ohtly.marshal.demos.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DbController {
    @Autowired
    private CustomerRepository customerRepository;

    @RequestMapping("/db")
    String showInfo() {
        Customer c = new Customer();
        c.setName("Joe");
        customerRepository.save(c);

        return customerRepository.findAll().toString();
    }
}
