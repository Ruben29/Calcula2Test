package calcula2;

import javax.swing.JOptionPane;

/**
 *
 * @author rfernandezgonzalez
 */
public class Vista {

    public static void Imprimir(Modelo res) {

        JOptionPane.showMessageDialog(null, res.num1 + " " + res.operacion + " " + res.num2 + " = " + res.resultado);

    }

}
