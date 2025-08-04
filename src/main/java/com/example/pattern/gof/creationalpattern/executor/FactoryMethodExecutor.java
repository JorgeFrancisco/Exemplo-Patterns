package com.example.pattern.gof.creationalpattern.executor;

import org.springframework.stereotype.Component;

import com.example.pattern.gof.creationalpattern.factorymethod.factory.Logistic;
import com.example.pattern.gof.creationalpattern.factorymethod.factory.core.RoadLogistic;
import com.example.pattern.gof.creationalpattern.factorymethod.factory.core.SeaLogistic;
import com.example.pattern.gof.creationalpattern.factorymethod.factory.spring.FactoryMethodService;
import com.example.pattern.utils.ConsoleUtils;

@Component
public class FactoryMethodExecutor {

	private final FactoryMethodService factoryMethodService;

	public FactoryMethodExecutor(FactoryMethodService factoryMethodService) {
		this.factoryMethodService = factoryMethodService;
	}

	public void run() {
		ConsoleUtils.printTitle("Factory Method (Spring)");

		springRun();

		ConsoleUtils.printTitle("Factory Method (Puro)");

		coreRun();
	}

	private void coreRun() {
		String tipoEntrega = "sea";

		Logistic logistic;

		if ("road".equalsIgnoreCase(tipoEntrega)) {
			logistic = new RoadLogistic();
		} else if ("sea".equalsIgnoreCase(tipoEntrega)) {
			logistic = new SeaLogistic();
		} else {
			throw new IllegalArgumentException("Tipo de entrega desconhecido: " + tipoEntrega);
		}

		logistic.planDeliver();
	}

	private void springRun() {
		factoryMethodService.executarEntrega("road");
		factoryMethodService.executarEntrega("sea");
	}
}