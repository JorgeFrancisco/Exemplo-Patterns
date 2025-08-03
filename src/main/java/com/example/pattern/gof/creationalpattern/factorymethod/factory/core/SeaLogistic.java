package com.example.pattern.gof.creationalpattern.factorymethod.factory.core;

import com.example.pattern.gof.creationalpattern.factorymethod.factory.Logistic;
import com.example.pattern.gof.creationalpattern.factorymethod.transport.Ship;
import com.example.pattern.gof.creationalpattern.factorymethod.transport.Transport;

public class SeaLogistic extends Logistic {

	@Override
	public Transport createTransport() {
		return new Ship();
	}

	@Override
	public String getTipo() {
		return null;
	}
}