package com.example.pattern.gof.creationalpattern.builder;

public interface CarBuilder {

	public void buildEngine();

	public void buildWheels();

	public Car getResult();

	public String getTipo();
}