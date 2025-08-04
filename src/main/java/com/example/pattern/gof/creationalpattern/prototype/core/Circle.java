package com.example.pattern.gof.creationalpattern.prototype.core;

public class Circle extends Shape {

	public int radius;

	public Circle(int x, int y, String color, int radius) {
		this.x = x;
		this.y = y;
		this.color = color;
		this.radius = radius;
	}
}