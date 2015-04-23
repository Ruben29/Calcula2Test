package calcula2;

import javax.swing.JOptionPane;

/**
 *
 * @author rfernandezgonzalez
 */
public class Vista {

    public static void imprimir(Modelo res) {

        JOptionPane.showMessageDialog(null, res.getResultado());

    }

    public static void introducir(Modelo contenedor) {

        contenedor.getNum1();
        contenedor.getNum2();
        contenedor.getOperacion();

    }

}
