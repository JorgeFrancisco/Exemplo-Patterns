package com.example.pattern.gof.creationalpattern.factorymethod.factory.spring;

import org.springframework.stereotype.Component;

import com.example.pattern.gof.creationalpattern.factorymethod.factory.Logistic;
import com.example.pattern.gof.creationalpattern.factorymethod.transport.Ship;
import com.example.pattern.gof.creationalpattern.factorymethod.transport.Transport;

@Component
public class SeaLogistic extends Logistic {

	@Override
	public Transport createTransport() {
		return new Ship();
	}

	@Override
	public String getTipo() {
		return "sea";
	}
}