package com.example.pattern.gof.creationalpattern.executor;

import org.springframework.stereotype.Component;

import com.example.pattern.gof.creationalpattern.builder.Car;
import com.example.pattern.gof.creationalpattern.builder.CarBuilder;
import com.example.pattern.gof.creationalpattern.builder.core.Director;
import com.example.pattern.gof.creationalpattern.builder.core.SportsCarBuilder;
import com.example.pattern.gof.creationalpattern.builder.spring.BuilderService;
import com.example.pattern.utils.ConsoleUtils;

@Component
public class BuilderExecutor {

	private final BuilderService builderService;

	public BuilderExecutor(BuilderService builderService) {
		this.builderService = builderService;
	}

	public void run() {
		ConsoleUtils.printTitle("Factory Method (Spring)");

		springRun();

		ConsoleUtils.printTitle("Factory Method (Puro)");

		coreRun();
	}

	private void coreRun() {
		// Instancia o builder específico
		CarBuilder builder = new SportsCarBuilder();

		// Instancia o diretor que orquestra a construção
		Director director = new Director();

		// Constrói o carro usando o builder
		director.construct(builder);

		// Recupera o produto final
		Car sportsCar = builder.getResult();

		// Exibe o resultado
		System.out.println(sportsCar);
	}

	private void springRun() {
		Car sportsCar = builderService.criarCarro("sports");

		System.out.println(sportsCar);
	}
}