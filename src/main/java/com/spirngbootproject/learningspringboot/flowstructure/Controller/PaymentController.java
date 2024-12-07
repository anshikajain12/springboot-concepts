package com.spirngbootproject.learningspringboot.flowstructure.Controller;

import com.spirngbootproject.learningspringboot.flowstructure.DTO.PaymentRequest;
import com.spirngbootproject.learningspringboot.flowstructure.DTO.PaymentResponse;
import com.spirngbootproject.learningspringboot.flowstructure.Service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
public class PaymentController {
    @Autowired
    PaymentService paymentService;
    @GetMapping("/{id}")
    public ResponseEntity<PaymentResponse> getPaymentById(@PathVariable Long id){

        //map incoming data to internal request DTO
        PaymentRequest internalRequestObj = new PaymentRequest();
        internalRequestObj.setPaymentId(id);

        //pass this internalRequestObj to further layer for processing
        PaymentResponse payment = paymentService.getPaymentDetailsById(internalRequestObj);

        //return the response DTO
        return ResponseEntity.ok(payment);
    }
}
