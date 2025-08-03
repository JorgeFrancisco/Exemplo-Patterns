package com.example.pattern.gof.creationalpattern.builder.core;

import com.example.pattern.gof.creationalpattern.builder.CarBuilder;

public class Director {

	public void construct(CarBuilder builder) {
		builder.buildEngine();
		builder.buildWheels();
	}
}