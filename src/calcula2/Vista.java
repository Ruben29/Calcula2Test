package calcula2;

import javax.swing.JOptionPane;

/**
 *
 * @author rfernandezgonzalez
 */
public class Vista {

    public void introducir(Modelo contenedor) {

        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Inserta el primer numero del operando"));
        contenedor.setNum1(num1);
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Inserta el segundo numero del operando"));
        contenedor.setNum2(num2);
        int operacion = Integer.parseInt(JOptionPane.showInputDialog("Que operacion quieres hacer?\n"
                + "1-Suma\n"
                + "2-Resta\n"
                + "3-Multiplicacion\n"
                + "4-Division\n"
                + "5-Salir"));
        contenedor.setOperacion(operacion);

    }

    public void imprimir(Modelo mod) {

        JOptionPane.showMessageDialog(null, "Primer numero: " + mod.getNum1() + "\nSegundo numero: " + mod.getNum2() + " \nOperacion: " + mod.getOperacion() + "\nResultado: " + mod.resultado);
    }
}
