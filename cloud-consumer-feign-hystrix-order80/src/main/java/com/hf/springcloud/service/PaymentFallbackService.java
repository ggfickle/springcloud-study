package com.hf.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @program: cloud2020
 * @description: 解耦进行服务的的降级
 * @author: xiehongfei
 * @create: 2021-05-04 15:25
 **/

@Component
public class PaymentFallbackService implements PaymentHystrixService
{
    @Override
    public String paymentInfo_OK(Integer id)
    {
        return "-----PaymentFallbackService fall back-paymentInfo_OK ,o(╥﹏╥)o";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id)
    {
        return "-----PaymentFallbackService fall back-paymentInfo_TimeOut ,o(╥﹏╥)o";
    }
}