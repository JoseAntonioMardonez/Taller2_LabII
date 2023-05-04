package gui;

import model.*;
import javax.swing.*;
import java.awt.event.ActionEvent;

public class VentanaPrincipal extends Ventana{

    private JLabel textoMenu;
    private JButton botonAgregar;
    private JButton botonDescontinuar;
    private JButton botonBuscar;
    private JButton botonModificar;
    private JButton botonSalida;

    public VentanaPrincipal() {
        super("Cafetería",600,600);
        generarElementosVentana();
    }

    private void generarElementosVentana(){
        generarMensajeMenu();
        generarBotonAgregarCafe();
        generarBotonDescontinuarCafe();
        generarBotonBuscarCafe();
        generarBotonModificarCafeteria();
        generarBotonSalir();
    }
    private void generarMensajeMenu() {
        String textoBienvenida = "Cafetería";
        super.generarJLabelEncabezado(this.textoMenu, textoBienvenida, 50, 30, 500, 30);
    }
    private void generarBotonAgregarCafe() {
        String textoBoton = "Agregar Café";
        this.botonAgregar = super.generarBoton(textoBoton, 225, 90, 150, 30);
        this.add(this.botonAgregar);
        this.botonAgregar.addActionListener(this);
    }
    private void generarBotonDescontinuarCafe() {
        String textoBoton = "Descontinuar Café";
        this.botonDescontinuar = super.generarBoton(textoBoton, 225, 150, 150, 30);
        this.add(this.botonDescontinuar);
        this.botonDescontinuar.addActionListener(this);

    }
    private void generarBotonBuscarCafe() {
        String textoBoton = "Buscar Café";
        this.botonBuscar = super.generarBoton(textoBoton, 225, 210, 150, 30);
        this.add(this.botonBuscar);
        this.botonBuscar.addActionListener(this);
    }
    private void generarBotonModificarCafeteria() {
        String textoBoton = "Modificar Cafetería";
        this.botonModificar = super.generarBoton(textoBoton, 225, 270, 150, 30);
        this.add(this.botonModificar);
        this.botonModificar.addActionListener(this);
    }

    private void generarBotonSalir() {
        String textoBoton = "Salir";
        this.botonSalida = super.generarBoton(textoBoton, 225, 390, 150, 40);
        this.add(this.botonSalida);
        this.botonSalida.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.botonAgregar) {

        }
        if (e.getSource() == this.botonDescontinuar) {

        }
        if (e.getSource() == this.botonBuscar) {

        }
        if (e.getSource() == this.botonModificar) {

        }
        if(e.getSource() == this.botonSalida){
            this.dispose();
            System.exit(0);
        }
    }

}