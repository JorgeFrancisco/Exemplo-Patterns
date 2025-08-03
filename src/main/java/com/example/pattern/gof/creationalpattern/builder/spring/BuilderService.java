package com.example.pattern.gof.creationalpattern.builder.spring;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.pattern.gof.creationalpattern.builder.Car;
import com.example.pattern.gof.creationalpattern.builder.CarBuilder;

@Service
public class BuilderService {

	private final Director director;

	private final List<CarBuilder> builders;

	public BuilderService(Director director, List<CarBuilder> builders) {
		this.director = director;
		this.builders = builders;
	}

	public Car criarCarro(String tipo) {
		CarBuilder builder = builders.stream().filter(b -> b.getTipo().equalsIgnoreCase(tipo)).findFirst()
				.orElseThrow(() -> new IllegalArgumentException("Tipo de carro não suportado: " + tipo));

		director.construct(builder);

		return builder.getResult();
	}
}