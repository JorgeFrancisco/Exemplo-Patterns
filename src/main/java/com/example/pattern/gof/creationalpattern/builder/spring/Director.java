package com.example.pattern.gof.creationalpattern.builder.spring;

import org.springframework.stereotype.Component;

import com.example.pattern.gof.creationalpattern.builder.CarBuilder;

@Component
public class Director {

	public void construct(CarBuilder builder) {
		builder.buildEngine();
		builder.buildWheels();
	}
}