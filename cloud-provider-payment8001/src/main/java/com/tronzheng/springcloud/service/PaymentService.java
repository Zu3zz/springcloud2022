package com.tronzheng.springcloud.service;

import com.tronzheng.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author 3zZ.
 * @date 2022/1/2.
 */
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
