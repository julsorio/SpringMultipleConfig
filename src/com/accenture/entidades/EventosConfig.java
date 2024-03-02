package com.accenture.entidades;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value = "com.accenture.servicios")
public class EventosConfig {
	@Bean(name = "evento1")
	public Evento evento1() {
		return new Evento(1, "Concierto Metallica", "World Tour 2024", "Madrid", "3 horas", "Musica", 67);
	}

	@Bean(name = "evento2")
	public Evento evento2() {
		return new Evento(2, "Concierto ACDC", "Hellfest 2024", "Francia", "3 horas", "Musica", 130);
	}

	@Bean(name = "evento3")
	public Evento evento3() {
		return new Evento(3, "Concierto Iron Maiden", "World Tour 2024", "Australia", "2 horas", "Musica", 310);
	}

	@Bean
	public List<Evento> listaEventos() {
		List<Evento> listaEventos = new ArrayList<>();
		listaEventos.add(evento1());
		listaEventos.add(evento2());
		listaEventos.add(evento3());

		return listaEventos;
	}
}
