package com.example.pattern.gof.creationalpattern.singleton.spring;

import org.springframework.stereotype.Service;

@Service
public class SingletonService {

	public void doSomething() {
		System.out.println("Executando lógica do singleton service.");
	}
}