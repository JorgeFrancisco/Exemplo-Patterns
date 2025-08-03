package com.example.pattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.pattern.gof.creationalpattern.abstractfactory.clientes.Cliente;
import com.example.pattern.gof.creationalpattern.abstractfactory.fabricas.DeliveryFactory;
import com.example.pattern.gof.creationalpattern.abstractfactory.fabricas.core.HamburgueriaFactory;
import com.example.pattern.gof.creationalpattern.abstractfactory.fabricas.core.PizzariaFactory;
import com.example.pattern.gof.creationalpattern.abstractfactory.fabricas.spring.AbstractFactoryService;
import com.example.pattern.gof.creationalpattern.builder.Car;
import com.example.pattern.gof.creationalpattern.builder.CarBuilder;
import com.example.pattern.gof.creationalpattern.builder.core.Director;
import com.example.pattern.gof.creationalpattern.builder.core.SportsCarBuilder;
import com.example.pattern.gof.creationalpattern.builder.spring.BuilderService;
import com.example.pattern.gof.creationalpattern.factorymethod.factory.Logistic;
import com.example.pattern.gof.creationalpattern.factorymethod.factory.core.RoadLogistic;
import com.example.pattern.gof.creationalpattern.factorymethod.factory.core.SeaLogistic;
import com.example.pattern.gof.creationalpattern.factorymethod.factory.spring.FactoryMethodService;
import com.example.pattern.gof.creationalpattern.singleton.core.Singleton;
import com.example.pattern.gof.creationalpattern.singleton.core.SingletonHolder;
import com.example.pattern.gof.creationalpattern.singleton.spring.SingletonService;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class PatternApplication {

	private final SingletonService singletonService;

	private final FactoryMethodService factoryMethodService;

	private final AbstractFactoryService abstractFactoryService;

	private final BuilderService builderService;

	public PatternApplication(SingletonService singletonService, FactoryMethodService factoryMethodService,
			AbstractFactoryService abstractFactoryService, BuilderService builderService) {
		this.singletonService = singletonService;
		this.factoryMethodService = factoryMethodService;
		this.abstractFactoryService = abstractFactoryService;
		this.builderService = builderService;
	}

	@PostConstruct
	private void init() {
		executaExemploSingletonService();

		executaExemploFactoryMethodService();

		executaExemploAbstractFactoryService();

		executaExemploBuilderService();
	}

	public static void main(String[] args) {
		SpringApplication.run(PatternApplication.class, args);

		executaExemploSingleton();

		executaExemploSingletonHolder();

		executaExemploFactoryMethod();

		executaExemploAbstractFactory();

		executaExemploBuilder();
	}

	private void executaExemploBuilderService() {
		System.out.println("----------------------------" + "executaExemploBuilderService");

		Car sportsCar = builderService.criarCarro("sports");

		System.out.println(sportsCar);
	}

	private static void executaExemploBuilder() {
		System.out.println("----------------------------" + "executaExemploBuilder");

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

	private void executaExemploAbstractFactoryService() {
		System.out.println("----------------------------" + "executaExemploAbstractFactoryService");

		DeliveryFactory factory = abstractFactoryService.selecionaTipo("hamburgueria");

		Cliente cliente = new Cliente(factory);

		cliente.criaPedido("tomate");
	}

	private static void executaExemploAbstractFactory() {
		System.out.println("----------------------------" + "executaExemploAbstractFactory");

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

	private void executaExemploFactoryMethodService() {
		System.out.println("----------------------------" + "executaExemploFactoryMethodService");

		factoryMethodService.executarEntrega("road");
		factoryMethodService.executarEntrega("sea");
	}

	private static void executaExemploFactoryMethod() {
		System.out.println("----------------------------" + "executaExemploFactoryMethod");

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

	private static void executaExemploSingletonHolder() {
		System.out.println("----------------------------" + "executaExemploSingletonHolder");

		SingletonHolder s1 = SingletonHolder.getInstance();

		SingletonHolder s2 = SingletonHolder.getInstance();

		System.out.println("s1 == s2? " + (s1 == s2));
	}

	private static void executaExemploSingleton() {
		System.out.println("----------------------------" + "executaExemploSingleton");

		Singleton s1 = Singleton.getInstance();

		Singleton s2 = Singleton.getInstance();

		System.out.println("s1 == s2? " + (s1 == s2));
	}

	private void executaExemploSingletonService() {
		System.out.println("----------------------------" + "executaExemploSingletonService");

		singletonService.doSomething();
	}
}