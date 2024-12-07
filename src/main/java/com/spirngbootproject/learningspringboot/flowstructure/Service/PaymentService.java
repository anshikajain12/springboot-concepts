package com.spirngbootproject.learningspringboot.flowstructure.Service;

import com.spirngbootproject.learningspringboot.flowstructure.DTO.PaymentRequest;
import com.spirngbootproject.learningspringboot.flowstructure.DTO.PaymentResponse;
import com.spirngbootproject.learningspringboot.flowstructure.Entity.PaymentEntity;
import com.spirngbootproject.learningspringboot.flowstructure.Repository.PaymentRepository;
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
