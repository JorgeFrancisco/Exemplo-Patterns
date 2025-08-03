package com.example.pattern.gof.creationalpattern.abstractfactory.bebidas;

public class Refrigerante implements Bebida {

	@Override
	public void escolheSemAcucar() {
		System.out.println("Refrigerante escolhido sem açucar");
	}
}