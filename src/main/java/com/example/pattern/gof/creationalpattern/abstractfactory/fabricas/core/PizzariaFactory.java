package com.example.pattern.gof.creationalpattern.abstractfactory.fabricas.core;

import com.example.pattern.gof.creationalpattern.abstractfactory.bebidas.Bebida;
import com.example.pattern.gof.creationalpattern.abstractfactory.bebidas.Refrigerante;
import com.example.pattern.gof.creationalpattern.abstractfactory.comidas.Comida;
import com.example.pattern.gof.creationalpattern.abstractfactory.comidas.Pizza;
import com.example.pattern.gof.creationalpattern.abstractfactory.fabricas.DeliveryFactory;

public class PizzariaFactory implements DeliveryFactory {

	@Override
	public Comida criaComida() {
		return new Pizza();
	}

	@Override
	public Bebida criaBebida() {
		return new Refrigerante();
	}

	@Override
	public String getTipo() {
		return null;
	}
}