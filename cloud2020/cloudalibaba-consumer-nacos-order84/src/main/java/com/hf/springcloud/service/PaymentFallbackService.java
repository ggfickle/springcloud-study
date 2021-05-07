package com.hf.springcloud.service;

import com.hf.springcloud.entities.CommonResult;
import com.hf.springcloud.entities.Payment;
import org.springframework.stereotype.Component;

/**
 * @ClassName: PaymentFallbackService
 * @author: xiehongfei
 * @description:
 **/
@Component
public class PaymentFallbackService implements PaymentService
{
    @Override
    public CommonResult<Payment> paymentSQL(Long id)
    {
        return new CommonResult<>(44444,"服务降级返回,---PaymentFallbackService",new Payment(id,"errorSerial"));
    }
}
