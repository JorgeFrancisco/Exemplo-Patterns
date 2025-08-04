package com.example.pattern.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class PatternRunner implements CommandLineRunner {

	private final SingletonExecutor singletonExecutor;
	private final BuilderExecutor builderExecutor;
	private final FactoryMethodExecutor factoryMethodExecutor;
	private final AbstractFactoryExecutor abstractFactoryExecutor;

	public PatternRunner(SingletonExecutor singletonExecutor, BuilderExecutor builderExecutor,
			FactoryMethodExecutor factoryMethodExecutor, AbstractFactoryExecutor abstractFactoryExecutor) {
		this.singletonExecutor = singletonExecutor;
		this.builderExecutor = builderExecutor;
		this.factoryMethodExecutor = factoryMethodExecutor;
		this.abstractFactoryExecutor = abstractFactoryExecutor;
	}

	@Override
	public void run(String... args) {
		singletonExecutor.run();
		builderExecutor.run();
		factoryMethodExecutor.run();
		abstractFactoryExecutor.run();
	}
}