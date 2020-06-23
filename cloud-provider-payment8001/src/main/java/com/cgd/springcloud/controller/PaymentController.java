package com.cgd.springcloud.controller;


import com.cgd.springcloud.entity.CommonResult;
import com.cgd.springcloud.entity.Payment;
import com.cgd.springcloud.service.PaymentService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Payment)表控制层
 *
 * @author makejava
 * @since 2020-06-22 18:20:11
 */
@RestController

public class PaymentController {
    /**
     * 服务对象
     */
    @Resource
    private PaymentService paymentService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public CommonResult<Payment> selectOne(Long id) {
        Payment payment = this.paymentService.queryById(id);
        if (payment != null){
            return new CommonResult<>(000000,"查询成功",payment);
        }else{
            return new CommonResult<>(200001,"查询失败");
        }
    }

}