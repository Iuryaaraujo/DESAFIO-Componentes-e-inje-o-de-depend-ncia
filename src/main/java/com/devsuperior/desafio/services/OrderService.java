package com.devsuperior.desafio.services;

import com.devsuperior.desafio.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    private ShippingService shippingService;

    public double total(Order order) {
        double valorDesconto = order.getBasic() * (order.getDiscount() / 100);
        double valorComDesconto = order.getBasic() - valorDesconto;
        double valorFrete = shippingService.shipment(order);
        return valorComDesconto + valorFrete;
    }
}
