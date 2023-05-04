package model;

public enum Tamanio {
    PEQUENIO("Pequeño"),
    MEDIANO("Mediano"),
    GRANDE("Grande");

    private String tamanio;

    private Tamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public String getTamanio() {
        return tamanio;
    }
}
