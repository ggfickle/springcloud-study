package com.hf.springcloud.service.impl;

import com.hf.springcloud.dao.PaymentDao;
import com.hf.springcloud.entities.Payment;
import com.hf.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: cloud2020
 * @description:
 * @author: xiehongfei
 * @create: 2021-05-01 15:43
 **/
@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
