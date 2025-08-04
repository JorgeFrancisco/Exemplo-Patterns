package com.example.pattern.runner;

import org.springframework.stereotype.Component;

import com.example.pattern.gof.creationalpattern.singleton.core.Singleton;
import com.example.pattern.gof.creationalpattern.singleton.core.SingletonHolder;
import com.example.pattern.gof.creationalpattern.singleton.spring.SingletonService;
import com.example.pattern.utils.ConsoleUtils;

@Component
public class SingletonExecutor {

	private final SingletonService singletonService;

	public SingletonExecutor(SingletonService singletonService) {
		this.singletonService = singletonService;
	}

	public void run() {
		ConsoleUtils.printTitle("Singleton (Spring)");

		singletonService.doSomething();

		ConsoleUtils.printTitle("Singleton (Puro)");

		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();

		System.out.println("s1 == s2? " + (s1 == s2));

		SingletonHolder sh1 = SingletonHolder.getInstance();
		SingletonHolder sh2 = SingletonHolder.getInstance();

		System.out.println("sh1 == sh2? " + (sh1 == sh2));
	}
}