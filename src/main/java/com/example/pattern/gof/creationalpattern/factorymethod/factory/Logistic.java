package com.example.pattern.gof.creationalpattern.factorymethod.factory;

import com.example.pattern.gof.creationalpattern.factorymethod.transport.Transport;

public abstract class Logistic {

	public void planDeliver() {
		Transport transport = createTransport();

		transport.deliver();
	}

	public abstract Transport createTransport();

	public abstract String getTipo();
}