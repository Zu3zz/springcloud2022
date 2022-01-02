package com.tronzheng.springcloud.service.impl;

import com.tronzheng.springcloud.dao.PaymentDao;
import com.tronzheng.springcloud.entities.Payment;
import com.tronzheng.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.PrimitiveIterator;

/**
 * @author 3zZ.
 * @date 2022/1/2.
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
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
