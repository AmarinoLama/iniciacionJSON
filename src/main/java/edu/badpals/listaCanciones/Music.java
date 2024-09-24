package edu.badpals.listaCanciones;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Music{

	@JsonProperty("listas")
	private List<ListasItem> listas;

	public List<ListasItem> getListas(){
		return listas;
	}
}