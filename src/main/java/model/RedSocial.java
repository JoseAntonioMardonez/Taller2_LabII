package model;

public class RedSocial {
    private String nombreRedSocial;
    private String usuario;

    public RedSocial(String nombreRedSocial, String usuario){
        this.nombreRedSocial=nombreRedSocial;
        this.usuario=usuario;
    }
    public String getNombreRedSocial() {
        return this.nombreRedSocial;
    }

    public void setNombreRedSocial(String nombreRedSocial) {
        this.nombreRedSocial = nombreRedSocial;
    }

    public String getUsuario() {
        return this.usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String toString() {
        return nombreRedSocial+", "+usuario;
    }
}
