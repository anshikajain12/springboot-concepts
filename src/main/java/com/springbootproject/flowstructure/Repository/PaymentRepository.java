package com.springbootproject.flowstructure.Repository;

import com.springbootproject.flowstructure.DTO.PaymentRequest;
import com.springbootproject.flowstructure.Entity.PaymentEntity;
import org.springframework.stereotype.Repository;

@Repository
public class PaymentRepository {
    public static PaymentEntity getPaymentById(PaymentRequest request) {
        PaymentEntity paymentModel = executeQuery(request);
        return paymentModel;
    }

    private static PaymentEntity executeQuery(PaymentRequest request) {
        //connect with db and fetch the data
        PaymentEntity payment = new PaymentEntity();
        payment.setId(request.getPaymentId());
        payment.setPaymentCurrency("INR");
        payment.setPaymentAmount(100.00);
        return payment;
    }
}
