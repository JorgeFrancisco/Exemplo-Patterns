package com.example.pattern.gof.creationalpattern.prototype.core;

public abstract class Shape implements Cloneable {

	public int x, y;

	public String color;

	public Shape clone() {
		try {
			return (Shape) super.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}
}