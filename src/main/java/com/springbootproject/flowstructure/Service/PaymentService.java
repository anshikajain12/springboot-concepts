package com.springbootproject.flowstructure.Service;

import com.springbootproject.flowstructure.DTO.PaymentRequest;
import com.springbootproject.flowstructure.DTO.PaymentResponse;
import com.springbootproject.flowstructure.Entity.PaymentEntity;
import com.springbootproject.flowstructure.Repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    @Autowired
    PaymentRepository paymentRepository;
    public PaymentResponse getPaymentDetailsById(PaymentRequest internalRequestObj){
        PaymentEntity paymentModel= PaymentRepository.getPaymentById(internalRequestObj);

        //map it to the response obj
        PaymentResponse paymentResponse = mapModelToResponseDTO(paymentModel);
        return paymentResponse;
    }
    private PaymentResponse mapModelToResponseDTO(PaymentEntity paymentEntity){
        PaymentResponse response = new PaymentResponse();
        response.setPaymentId(paymentEntity.getId());
        response.setAmount(paymentEntity.getPaymentAmount());
        response.setCurrency(paymentEntity.getPaymentCurrency());
        return response;
    }
}
