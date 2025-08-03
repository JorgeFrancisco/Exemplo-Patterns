package com.example.pattern.gof.creationalpattern.factorymethod.transport;

public class Truck implements Transport {

	@Override
	public void deliver() {
		System.out.println("Entrega realizada de caminhão!");
	}
}