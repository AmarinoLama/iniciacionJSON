package edu.badpals.listaCanciones;

import java.util.List;
//import com.fasterxml.jackson.annotation.JsonProperty;

public class ListasItem{

	//@JsonProperty("canciones")
	private List<CancionesItem> canciones;

	//@JsonProperty("nombre")
	private String nombre;

	//@JsonProperty("fechaCreacoin")
	private String fechaCreacoin;

	public List<CancionesItem> getCanciones(){
		return canciones;
	}

	public String getNombre(){
		return nombre;
	}

	public String getFechaCreacoin(){
		return fechaCreacoin;
	}
}