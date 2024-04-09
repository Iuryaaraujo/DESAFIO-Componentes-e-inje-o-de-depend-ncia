package com.devsuperior.desafio;

import com.devsuperior.desafio.entities.Order;
import com.devsuperior.desafio.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesafioApplication implements CommandLineRunner {

	@Autowired
	public OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(DesafioApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		Order pedido1 = new Order(1034L, 150.00, 10.0);
		double valorTotal1 = orderService.total(pedido1);
		System.out.println("Pedido código " + pedido1.getCode());
		System.out.println("Valor total: R$" + valorTotal1);

		Order pedido2 = new Order(2282L, 800.00, 10.0);
		double valorTotal2 = orderService.total(pedido2);
		System.out.println("\nPedido código " + pedido2.getCode());
		System.out.println("Valor total: R$" + valorTotal2);

		Order pedido3 = new Order(1309L, 95.90, 0.0);
		double valorTotal3 = orderService.total(pedido3);
		System.out.println("\nPedido código " + pedido3.getCode());
		System.out.println("Valor total: R$" + valorTotal3);
	}
}
