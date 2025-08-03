package com.example.pattern.gof.creationalpattern.abstractfactory.fabricas.spring;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.pattern.gof.creationalpattern.abstractfactory.fabricas.DeliveryFactory;

@Service
public class AbstractFactoryService {

	private final List<DeliveryFactory> factories;

	public AbstractFactoryService(List<DeliveryFactory> factories) {
		this.factories = factories;
	}

	public DeliveryFactory selecionaTipo(String tipo) {
		return factories.stream().filter(t -> t.getTipo().equalsIgnoreCase(tipo)).findFirst()
				.orElseThrow(() -> new IllegalArgumentException("Tipo inválido: " + tipo));
	}
}