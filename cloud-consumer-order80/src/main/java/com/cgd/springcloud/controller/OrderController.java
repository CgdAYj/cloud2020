package com.cgd.springcloud.controller;

import com.cgd.springcloud.CommonResult;
import com.cgd.springcloud.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
@RestController
public class OrderController {
    @Autowired
    RestTemplate restTemplate;

    public static final String PAYMENT_URL = "http://localhost:8001";
    @GetMapping("/selectOne/{id}")
    public CommonResult<Payment> getSelectOne(@PathVariable("id") Long id){
        return restTemplate.getForObject(PAYMENT_URL + "/selectOne?id=" + id, CommonResult.class);

    }
}
