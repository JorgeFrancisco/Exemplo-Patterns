package com.example.pattern.gof.creationalpattern.prototype.spring;

import org.springframework.stereotype.Service;

@Service
public class PrototypeService {

	private final Circle circlePrototype;

	public PrototypeService(Circle circlePrototype) {
		this.circlePrototype = circlePrototype;
	}

	public void executar() {
		// Configura o protótipo original
		circlePrototype.x = 10;
		circlePrototype.y = 20;
		circlePrototype.color = "blue";
		circlePrototype.radius = 15;

		// Clona manualmente
		Circle clone1 = (Circle) circlePrototype.cloneShape();
		clone1.color = "red";

		Circle clone2 = (Circle) circlePrototype.cloneShape();
		clone2.radius = 25;

		System.out.println("Original: " + circlePrototype);
		System.out.println("Clone 1:  " + clone1);
		System.out.println("Clone 2:  " + clone2);
	}
}