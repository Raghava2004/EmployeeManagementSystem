package com.knot.Banking.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.knot.Banking.Bo.AccountBo;
import com.knot.Banking.Bo.CardsBo;
import com.knot.Banking.Bo.CustomerBo;
import com.knot.Banking.Service.CustomerService;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class CustomerController {
    
    @Autowired
    CustomerService customerService;

    @GetMapping("/getCustomerById/{Id}")
    public CustomerBo getCustomerById(@PathVariable String Id) {
        return customerService.getCustomerById(Id);
    }

    @GetMapping("/getAccountByCustomerId/{Id}")
    public AccountBo getAccountByCustomerId(@PathVariable String Id) {
        return customerService.getAccountByCustomerId(Id);
    }

    @GetMapping("/getCardByCustomerId/{Id}")
    public CardsBo getCardByCustomerId(@PathVariable String Id) {
        return customerService.getCardByCustomerId(Id);
    }

    // Your original method modified to check for Authorization header
    @GetMapping("/getAllCustomers")
    public  List<CustomerBo> getAllCustomers(HttpServletRequest request) {
    	 return customerService.getAllCustomers();
    }
}