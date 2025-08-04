package com.example.pattern.gof.creationalpattern.prototype.spring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype") // Importante: garante que o Spring crie uma nova instância sempre que injetado
public class Circle extends Shape {

	public int radius;

	public Circle() {
		// Construtor default exigido pelo Spring
	}

	public Circle(int x, int y, String color, int radius) {
		this.x = x;
		this.y = y;
		this.color = color;
		this.radius = radius;
	}

	@Override
	public Shape cloneShape() {
		Circle clone = new Circle();

		clone.x = this.x;
		clone.y = this.y;
		clone.color = this.color;
		clone.radius = this.radius;

		return clone;
	}

	@Override
	public String toString() {
		return String.format("Circle[x=%d, y=%d, color=%s, radius=%d]", x, y, color, radius);
	}
}