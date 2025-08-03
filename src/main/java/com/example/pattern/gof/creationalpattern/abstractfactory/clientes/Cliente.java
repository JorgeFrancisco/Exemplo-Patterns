package com.example.pattern.gof.creationalpattern.abstractfactory.clientes;

import com.example.pattern.gof.creationalpattern.abstractfactory.bebidas.Bebida;
import com.example.pattern.gof.creationalpattern.abstractfactory.comidas.Comida;
import com.example.pattern.gof.creationalpattern.abstractfactory.fabricas.DeliveryFactory;

public class Cliente {

	private final DeliveryFactory factory;

	public Cliente(DeliveryFactory factory) {
		this.factory = factory;
	}

	public void criaPedido(String ingrediente) {
		Comida comida = factory.criaComida();

		Bebida bebida = factory.criaBebida();

		comida.removeIngrediente(ingrediente);
		bebida.escolheSemAcucar();
	}
}