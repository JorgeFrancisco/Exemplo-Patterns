package com.example.pattern.gof.creationalpattern.abstractfactory.fabricas;

import com.example.pattern.gof.creationalpattern.abstractfactory.bebidas.Bebida;
import com.example.pattern.gof.creationalpattern.abstractfactory.comidas.Comida;

public interface DeliveryFactory {

	public Comida criaComida();

	public Bebida criaBebida();

	public String getTipo();
}