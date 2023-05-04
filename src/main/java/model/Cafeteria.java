package model;

import java.util.ArrayList;
import model.Cafe;

public class Cafeteria {
	private String nombre;
	private String direccion;
	private ArrayList<Cafe> cafes = new ArrayList<Cafe>();
	private ArrayList<RedSocial> redesSociales = new ArrayList<RedSocial>();

	public Cafeteria(String nombre, String direccion) {
		this.nombre=nombre;
		this.direccion=direccion;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public ArrayList<Cafe> getCafes() {
		return cafes;
	}

	public ArrayList<RedSocial> getRedesSociales() {
		return redesSociales;
	}

	public String toString() {
		return nombre+", "+direccion+", "+redesSociales;
	}
}