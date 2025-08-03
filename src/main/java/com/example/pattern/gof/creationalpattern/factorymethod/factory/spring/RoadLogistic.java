package com.example.pattern.gof.creationalpattern.factorymethod.factory.spring;

import org.springframework.stereotype.Component;

import com.example.pattern.gof.creationalpattern.factorymethod.factory.Logistic;
import com.example.pattern.gof.creationalpattern.factorymethod.transport.Transport;
import com.example.pattern.gof.creationalpattern.factorymethod.transport.Truck;

@Component
public class RoadLogistic extends Logistic {

	@Override
	public Transport createTransport() {
		return new Truck();
	}

	@Override
	public String getTipo() {
		return "road";
	}
}