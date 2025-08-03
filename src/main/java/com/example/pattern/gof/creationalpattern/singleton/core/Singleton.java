package com.example.pattern.gof.creationalpattern.singleton.core;

public class Singleton {

	private static Singleton instance;

	private Singleton() {
	}

	public static synchronized Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();

			System.out.println("Instancia criada!");
		} else {
			System.out.println("Instancia ja existia!");
		}

		return instance;
	}
}