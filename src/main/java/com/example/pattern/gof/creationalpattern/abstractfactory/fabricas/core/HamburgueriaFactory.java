package com.example.pattern.gof.creationalpattern.abstractfactory.fabricas.core;

import com.example.pattern.gof.creationalpattern.abstractfactory.bebidas.Bebida;
import com.example.pattern.gof.creationalpattern.abstractfactory.bebidas.MilkShake;
import com.example.pattern.gof.creationalpattern.abstractfactory.comidas.Comida;
import com.example.pattern.gof.creationalpattern.abstractfactory.comidas.Hamburguer;
import com.example.pattern.gof.creationalpattern.abstractfactory.fabricas.DeliveryFactory;

public class HamburgueriaFactory implements DeliveryFactory {

	@Override
	public Comida criaComida() {
		return new Hamburguer();
	}

	@Override
	public Bebida criaBebida() {
		return new MilkShake();
	}

	@Override
	public String getTipo() {
		return null;
	}
}