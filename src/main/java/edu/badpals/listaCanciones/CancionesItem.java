package edu.badpals.listaCanciones;

import com.fasterxml.jackson.annotation.JsonProperty;

// Archivo generado automáticamente

public class CancionesItem{

	@JsonProperty("titulo")
	private String titulo;

	@JsonProperty("duracion")
	private String duracion;

	@JsonProperty("autor")
	private String autor;

	public String getTitulo(){
		return titulo;
	}

	public String getDuracion(){
		return duracion;
	}

	public String getAutor(){
		return autor;
	}
}