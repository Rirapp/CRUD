package com.example.CRUD.repository;


import com.example.CRUD.entity.Customers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomersRepository  extends JpaRepository<Customers, Long> {


}
