package com.deusley.paymentservice.service.impl;

import com.deusley.paymentservice.model.Payment;
import com.deusley.paymentservice.service.PaymentService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class PaymentServiceImpl implements PaymentService {


    @Override
    public void sendPayment(Payment payment) {
        log.info("PAYMENT_SERVICE_IMPL :: Pagamento Recebido {}", payment);

    }
}
