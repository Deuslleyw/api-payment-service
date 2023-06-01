package com.deusley.paymentservice.service.impl;

import com.deusley.paymentservice.model.Payment;
import com.deusley.paymentservice.service.PaymentService;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.io.Serializable;

@RequiredArgsConstructor
@Service
@Log4j2
public class PaymentServiceImpl implements PaymentService {

    private final KafkaTemplate<String, Serializable> kafkaTemplate;

    @SneakyThrows
    @Override
    public void sendPayment(Payment payment) {

        log.info("Pagamento Recebido {}", payment);
        Thread.sleep(1000);
        log.info("enviando o pagamento");

        kafkaTemplate.send("payment-topic", payment);
    }
}
