package com.example.pattern.runner;

import org.springframework.stereotype.Component;

import com.example.pattern.gof.creationalpattern.abstractfactory.clientes.Cliente;
import com.example.pattern.gof.creationalpattern.abstractfactory.fabricas.DeliveryFactory;
import com.example.pattern.gof.creationalpattern.abstractfactory.fabricas.core.HamburgueriaFactory;
import com.example.pattern.gof.creationalpattern.abstractfactory.fabricas.core.PizzariaFactory;
import com.example.pattern.gof.creationalpattern.abstractfactory.fabricas.spring.AbstractFactoryService;
import com.example.pattern.utils.ConsoleUtils;

@Component
public class AbstractFactoryExecutor {

	private final AbstractFactoryService abstractFactoryService;

	public AbstractFactoryExecutor(AbstractFactoryService abstractFactoryService) {
		this.abstractFactoryService = abstractFactoryService;
	}

	public void run() {
		ConsoleUtils.printTitle("Abstract Factory (Spring)");

		DeliveryFactory factorySpring = abstractFactoryService.selecionaTipo("hamburgueria");

		Cliente clienteSpring = new Cliente(factorySpring);

		clienteSpring.criaPedido("tomate");

		ConsoleUtils.printTitle("Abstract Factory (Puro)");

		String tipoDelivery = "pizzaria";

		DeliveryFactory factory;

		if ("hamburgueria".equals(tipoDelivery)) {
			factory = new HamburgueriaFactory();
		} else if ("pizzaria".equals(tipoDelivery)) {
			factory = new PizzariaFactory();
		} else {
			throw new IllegalArgumentException("Tipo de delivery desconhecido: " + tipoDelivery);
		}

		Cliente cliente = new Cliente(factory);

		cliente.criaPedido("cebola");
	}
}