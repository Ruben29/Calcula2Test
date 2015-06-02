package calcula2;

import javax.swing.JOptionPane;

/**
 *
 * @author rfernandezgonzalez
 */
public class Calcula2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Modelo contenedor = new Modelo();
        Vista vist = new Vista();
        Controlador control = new Controlador();
        vist.introducir(contenedor);
        control.realizaOperacion(contenedor);
        vist.imprimir(contenedor);

    }
}
