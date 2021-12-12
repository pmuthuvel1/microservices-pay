package com.payment.pay.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.payment.pay.model.Pay;


public interface PayRepo extends JpaRepository<Pay, Long>  {

}
