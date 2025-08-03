package com.example.pattern.gof.creationalpattern.abstractfactory.comidas;

public class Hamburguer implements Comida {

	@Override
	public void removeIngrediente(String nome) {
		System.out.println("Removido o ingrediente %s do hamburguer".formatted(nome));
	}
}