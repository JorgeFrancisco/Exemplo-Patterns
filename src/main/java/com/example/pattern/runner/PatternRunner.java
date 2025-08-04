package com.example.pattern.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.pattern.gof.creationalpattern.executor.AbstractFactoryExecutor;
import com.example.pattern.gof.creationalpattern.executor.BuilderExecutor;
import com.example.pattern.gof.creationalpattern.executor.FactoryMethodExecutor;
import com.example.pattern.gof.creationalpattern.executor.PrototypeExecutor;
import com.example.pattern.gof.creationalpattern.executor.SingletonExecutor;

@Component
public class PatternRunner implements CommandLineRunner {

	private final SingletonExecutor singletonExecutor;
	private final BuilderExecutor builderExecutor;
	private final FactoryMethodExecutor factoryMethodExecutor;
	private final AbstractFactoryExecutor abstractFactoryExecutor;
	private final PrototypeExecutor prototypeExecutor;

	public PatternRunner(SingletonExecutor singletonExecutor, BuilderExecutor builderExecutor,
			FactoryMethodExecutor factoryMethodExecutor, AbstractFactoryExecutor abstractFactoryExecutor,
			PrototypeExecutor prototypeExecutor) {
		this.singletonExecutor = singletonExecutor;
		this.builderExecutor = builderExecutor;
		this.factoryMethodExecutor = factoryMethodExecutor;
		this.abstractFactoryExecutor = abstractFactoryExecutor;
		this.prototypeExecutor = prototypeExecutor;
	}

	@Override
	public void run(String... args) {
		singletonExecutor.run();
		builderExecutor.run();
		factoryMethodExecutor.run();
		abstractFactoryExecutor.run();
		prototypeExecutor.run();
	}
}