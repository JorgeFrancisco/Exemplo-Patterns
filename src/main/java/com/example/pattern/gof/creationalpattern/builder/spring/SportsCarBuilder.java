package com.example.pattern.gof.creationalpattern.builder.spring;

import org.springframework.stereotype.Component;

import com.example.pattern.gof.creationalpattern.builder.Car;
import com.example.pattern.gof.creationalpattern.builder.CarBuilder;

@Component
public class SportsCarBuilder implements CarBuilder {

	private Car car;

	public SportsCarBuilder() {
		reset();
	}

	private void reset() {
		this.car = new Car();
	}

	@Override
	public void buildEngine() {
		car.engine = "V8";
	}

	@Override
	public void buildWheels() {
		car.wheels = "18 inch";
	}

	@Override
	public Car getResult() {
		Car finished = this.car;
		reset(); // Reset para novo uso
		return finished;
	}

	@Override
	public String getTipo() {
		return "sports";
	}
}