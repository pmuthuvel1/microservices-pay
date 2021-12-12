package com.payment.pay.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.payment.pay.model.Pay;
import com.payment.pay.repo.PayRepo;

@RestController
@RequestMapping("salesapi")
public class PayController {

	@Autowired
    private PayRepo payRepo;
	
	@GetMapping("findAll")
    public List<Pay> findAll() {
        return payRepo.findAll();
    }

	@PostMapping("create")
    public Pay create(@RequestBody Pay customer) {
        return payRepo.save(customer);
    }

    @DeleteMapping("delete/{id}")
    public void delete(@PathVariable Long id) {
    	payRepo.deleteById(id);
    }

    @PutMapping("update/{id}")
    public Pay updateCustomer(@RequestBody Pay pay, @PathVariable Long id) {        
        return payRepo.save(pay);
    }
    
}
