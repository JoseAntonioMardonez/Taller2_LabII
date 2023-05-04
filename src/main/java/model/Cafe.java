package model;

public class Cafe {
	private String nombre;
	private int gramosDeCafe;
	private int mililitrosDeAgua;
	private String tamanio;

	public Cafe(String nombre, int gramosDeCafe, int mililitrosDeAgua, String tamanio) {
		throw new UnsupportedOperationException();
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

	public String getTamanio() {
		return this.tamanio;
	}

	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
	}
}