package com.sidneydev.paymentservice.service;

import com.sidneydev.paymentservice.model.Payment;

public interface PaymentService {

    void sendPayment(Payment payment);
}
