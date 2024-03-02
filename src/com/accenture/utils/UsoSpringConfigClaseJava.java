package com.accenture.utils;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.accenture.entidades.EventosConfig;
import com.accenture.servicios.GestionEventos;

public class UsoSpringConfigClaseJava {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(EventosConfig.class);
		GestionEventos gestionEventos = context.getBean("gestionEventos", GestionEventos.class);
		System.out.println("Listado de eventos");
		System.out.println("------------------");
		gestionEventos.getListaEventos().forEach(evento -> {
			System.out.println(evento.toString());
		});
	}

}
