package gui;

import model.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
public class VentanaAgregarCafe extends Ventana {

    private JLabel textoMenu;
    private JLabel textoNombre;
    private JLabel textoGramos;
    private JLabel textoMililitros;
    private JLabel textoTamanio;
    private JTextField entradaTextoNombre;
    private JTextField entradaTextoGramos;
    private JTextField entradaTextoMililitros;
    private JComboBox listaDesplegableTamanio;
    private JButton botonAgregar;
    private JButton botonVolver;
    public VentanaAgregarCafe(){
        super("Cafetería",600,600);
        generarElementosVentana();
    }
    private void generarElementosVentana(){
        generarMensajeMenu();
        generarTextoNombre();
        generarEntradaDeTextoNombre();
        generarTextoGramos();
        generarEntradaDeTextoGramos();
        generarTextoMililitros();
        generarEntradaDeTextoMililitros();
        generarTextoTamanio();
        generarListaDesplegableTamanio();
        generarBotonAgregarLibro();
        generarBotonVolver();
    }
    private void generarMensajeMenu() {
        String textoBienvenida = "Cafetería - Agregar Café";
        super.generarJLabelEncabezado(this.textoMenu, textoBienvenida, 50, 30, 500, 30);
    }
    //Nombre
    private void generarTextoNombre() {
        String textoNombre = "Nombre del Café:";
        super.generarJLabel(this.textoNombre, textoNombre, 50, 80, 500, 30);
    }
    private void generarEntradaDeTextoNombre() {

        this.entradaTextoNombre = super.generarJTextField(50, 115, 500, 20);
        this.add(this.entradaTextoNombre);
        this.entradaTextoNombre.addActionListener(this);

    }
    //Gramos
    private void generarTextoGramos() {
        String textoGramos = "Gramos de Café:";
        super.generarJLabel(this.textoGramos, textoGramos, 50, 140, 500, 30);
    }
    private void generarEntradaDeTextoGramos() {

        this.entradaTextoGramos = super.generarJTextField(50, 175, 500, 20);
        this.add(this.entradaTextoGramos);
        this.entradaTextoGramos.addActionListener(this);

    }
    //Mililitros
    private void generarTextoMililitros() {
        String textoMililitros = "Mililitros de Agua:";
        super.generarJLabel(this.textoMililitros, textoMililitros, 50, 200, 500, 30);
    }
    private void generarEntradaDeTextoMililitros() {

        this.entradaTextoMililitros = super.generarJTextField(50, 235, 500, 20);
        this.add(this.entradaTextoMililitros);
        this.entradaTextoMililitros.addActionListener(this);

    }
    //Tamaño
    private void generarTextoTamanio() {
        String textoTamanio = "Tamaño:";
        super.generarJLabel(this.textoTamanio, textoTamanio, 50, 260, 500, 30);
    }
    private void generarListaDesplegableTamanio() {

        this.listaDesplegableTamanio = super.generarListaDesplegable(Tamanio.values(),50, 295, 500, 20);
        this.add(this.listaDesplegableTamanio);
        this.listaDesplegableTamanio.addActionListener(this);

    }
    //Botones
    private void generarBotonAgregarLibro() {
        String textoBoton = "Agregar Café";
        this.botonAgregar = super.generarBoton(textoBoton, 225, 350, 150, 30);
        this.add(this.botonAgregar);
        this.botonAgregar.addActionListener(this);
    }
    private void generarBotonVolver() {
        String textoBoton = "Volver";
        this.botonVolver = super.generarBoton(textoBoton, 225, 390, 150, 40);
        this.add(this.botonVolver);
        this.botonVolver.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.entradaTextoNombre) {

        }
        if (e.getSource() == this.entradaTextoGramos) {

        }
        if (e.getSource() == this.entradaTextoMililitros) {

        }
        if (e.getSource() == this.listaDesplegableTamanio) {

        }
        if (e.getSource() == this.botonAgregar) {

        }

        if(e.getSource() == this.botonVolver){
            new VentanaPrincipal();
            this.dispose();
        }
    }


}