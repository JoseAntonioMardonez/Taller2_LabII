package model;

import java.util.ArrayList;

public class Cafe {
	private String nombre;
	private int gramosDeCafe;
	private int mililitrosDeAgua;
	private Tamanio tamanio;
	private ArrayList<IngredientesOpcionales> ingredientes;

	public Cafe(String nombre, int gramosDeCafe, int mililitrosDeAgua, Tamanio tamanio) {
		this.nombre=nombre;
		this.gramosDeCafe=gramosDeCafe;
		this.mililitrosDeAgua=mililitrosDeAgua;
		this.tamanio=tamanio;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getGramosDeCafe() {
		return this.gramosDeCafe;
	}

	public void setGramosDeCafe(int gramosDeCafe) {
		this.gramosDeCafe = gramosDeCafe;
	}

	public int getMililitrosDeAgua() {
		return this.mililitrosDeAgua;
	}

	public void setMililitrosDeAgua(int mililitrosDeAgua) {
		this.mililitrosDeAgua = mililitrosDeAgua;
	}

	public Tamanio getTamanio() {
		return this.tamanio;
	}

	public void setTamanio(Tamanio tamanio) {
		this.tamanio = tamanio;
	}

	public ArrayList<IngredientesOpcionales> getIngredientes() {
		return ingredientes;
	}

	public String toString() {
		return nombre+", "+gramosDeCafe+", "+mililitrosDeAgua+", "+tamanio+", "+ingredientes;
	}
}