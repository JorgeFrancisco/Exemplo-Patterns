package com.example.pattern.gof.creationalpattern.factorymethod.factory.spring;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.pattern.gof.creationalpattern.factorymethod.factory.Logistic;

@Service
public class FactoryMethodService {

	private final List<Logistic> factories;

	public FactoryMethodService(List<Logistic> factories) {
		this.factories = factories;
	}

	public void executarEntrega(String tipo) {
		Logistic selected = factories.stream().filter(t -> t.getTipo().equalsIgnoreCase(tipo)).findFirst()
				.orElseThrow(() -> new IllegalArgumentException("Tipo inválido: " + tipo));

		selected.planDeliver();
	}
}