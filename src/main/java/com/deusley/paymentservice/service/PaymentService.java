package com.deusley.paymentservice.service;

import com.deusley.paymentservice.model.Payment;

public interface PaymentService {

    void sendPayment(Payment payment);
}
