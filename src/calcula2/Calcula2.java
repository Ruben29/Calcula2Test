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

    }

    public float realizaOperacion(Modelo contenedor) {

        float resultado = 0;

        if (contenedor.operacion.equals("suma")) {

            contenedor.resultado = contenedor.num1 + contenedor.num2;

        } else if (contenedor.operacion.equals("resta")) {

        } else if (contenedor.operacion.equals("multiplicacion")) {

        } else if (contenedor.operacion.equals("division")) {

        }

        return resultado;

    }

}
