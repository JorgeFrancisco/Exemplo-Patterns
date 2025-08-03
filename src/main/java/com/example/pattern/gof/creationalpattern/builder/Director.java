package com.example.pattern.gof.creationalpattern.builder;

public class Director {

	public void construct(CarBuilder builder) {
		builder.buildEngine();
		builder.buildWheels();
	}
}