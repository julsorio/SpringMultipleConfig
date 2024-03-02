package com.accenture.utils;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.accenture.servicios.GestionEventos;

public class ApplicationContextTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		GestionEventos gestionEventos = context.getBean("gestionEventos", GestionEventos.class);
		System.out.println("Listado de eventos");
		System.out.println("------------------");
		gestionEventos.getListaEventos().forEach(evento -> {
			System.out.println(evento.toString());
		});
	}

}
