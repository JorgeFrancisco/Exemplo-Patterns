package com.example.pattern.gof.creationalpattern.abstractfactory.bebidas;

public class MilkShake implements Bebida {

	@Override
	public void escolheSemAcucar() {
		System.out.println("MilkShake escolhido sem açucar");
	}
}