package com.example.pattern.gof.creationalpattern.executor;

import org.springframework.stereotype.Component;

import com.example.pattern.gof.creationalpattern.prototype.core.Circle;
import com.example.pattern.gof.creationalpattern.prototype.spring.PrototypeService;
import com.example.pattern.utils.ConsoleUtils;

@Component
public class PrototypeExecutor {

	private final PrototypeService prototypeService;

	public PrototypeExecutor(PrototypeService prototypeService) {
		this.prototypeService = prototypeService;
	}

	public void run() {
		ConsoleUtils.printTitle("Prototype (Spring)");

		runSpring();

		ConsoleUtils.printTitle("Prototype (Puro)");

		runCore();
	}

	private void runCore() {
		// Criação do objeto original
		Circle original = new Circle(10, 20, "red", 15);

		System.out.println("Original: " + describe(original));

		// Clonando o objeto
		Circle clone = (Circle) original.clone();

		System.out.println("Clone:    " + describe(clone));

		// Alterando o clone
		clone.x = 30;
		clone.color = "blue";

		System.out.println("\nApós modificar o clone:");
		System.out.println("Original: " + describe(original));
		System.out.println("Clone:    " + describe(clone));
	}

	private void runSpring() {
		prototypeService.executar();
	}

	private static String describe(Circle c) {
		return "Circle[x=" + c.x + ", y=" + c.y + ", color=" + c.color + ", radius=" + c.radius + "]";
	}
}