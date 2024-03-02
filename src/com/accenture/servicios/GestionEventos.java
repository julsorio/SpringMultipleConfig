package com.accenture.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.accenture.entidades.Evento;

@Component
public class GestionEventos {
	@Autowired
	private List<Evento> listaEventos;

	public List<Evento> getListaEventos() {
		return listaEventos;
	}

	public void setListaEventos(List<Evento> listaEventos) {
		this.listaEventos = listaEventos;
	}
	
	
}
