package com.example.pattern.gof.creationalpattern.factorymethod.factory.core;

import com.example.pattern.gof.creationalpattern.factorymethod.factory.Logistic;
import com.example.pattern.gof.creationalpattern.factorymethod.transport.Transport;
import com.example.pattern.gof.creationalpattern.factorymethod.transport.Truck;

public class RoadLogistic extends Logistic {

	@Override
	public Transport createTransport() {
		return new Truck();
	}

	@Override
	public String getTipo() {
		return null;
	}
}