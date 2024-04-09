package com.devsuperior.desafio.services;

import com.devsuperior.desafio.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {
    public double shipment(Order order) {
        if (order.getDiscount() < 100.00) {
            return 20.00;
        } else if (order.getDiscount() < 200.00) {
            return 12.00;
        } else {
            return 0.00;
        }
    }
}