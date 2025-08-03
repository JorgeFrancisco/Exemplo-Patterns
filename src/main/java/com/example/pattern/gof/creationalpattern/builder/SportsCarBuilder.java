package com.example.pattern.gof.creationalpattern.builder;

public class SportsCarBuilder implements CarBuilder {

	private Car car = new Car();

	public void buildEngine() {
		car.engine = "V8";
	}

	public void buildWheels() {
		car.wheels = "18 inch";
	}

	public Car getResult() {
		return car;
	}

	@Override
	public String getTipo() {
		return null;
	}
}