package com.example.CRUD.controller;


import com.example.CRUD.entity.Customers;
import com.example.CRUD.service.CustomersService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@AllArgsConstructor
@RequestMapping("api")
@RestController
public class CustomersController {

    @Autowired
    private final CustomersService customersService;

    //get list customers
    @GetMapping(value = "/customers")
    public List<Customers> getListUser() {

        return customersService.getListCustomer();
    }

    //get customer by id
    @GetMapping(value = "/customers/{id}")
    public Customers getListUser(@PathVariable Long id) {

        return customersService.getCustomerById(id);
    }

    // create cust
    @PostMapping(value = "/customers")
    public Customers createCustomer(@RequestBody Customers customers) {

        return customersService.createCustomer(customers);
    }

    //update custumer by id
    @PutMapping(value = "/customers/{id}")
    public Customers updateCustomerById(@PathVariable Long id, @RequestBody Customers customers) {

        return customersService.updateCustomerById(id, customers);
    }

    ////deletecustumer by id
    @DeleteMapping("/customers/{id}")
    public void deleteCustomer(@PathVariable Long id) {
        customersService.deleteCustomer(id);
    }

}
