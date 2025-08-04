package com.example.pattern.gof.creationalpattern.prototype.spring;

public abstract class Shape {

	public int x, y;
	public String color;

	public abstract Shape cloneShape();
}