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

        float num1 = Float.parseFloat(JOptionPane.showInputDialog("Número 1"));
        contenedor.setNum1(num1);

        float num2 = Float.parseFloat(JOptionPane.showInputDialog("Número 2"));
        contenedor.setNum2(num2);

        int operacion = Integer.parseInt(JOptionPane.showInputDialog("Introduzca lo que desea hacer:"
                + "\n 1- Sumar"
                + "\n 2- Restar"
                + "\n 3- Multiplicar"
                + "\n 4- Dividir"
                + "\n 5- Salir"));

        contenedor.setOperacion(operacion);

        float resul = realizarOperacion(contenedor.getNum1(), contenedor.getNum2(), contenedor.getOperacion());
        contenedor.setResultado(resul);

        Vista.imprimir(contenedor);
                
        Vista.introducir(contenedor);
        
        
        contenedor.setResultado(realizarOperacion(contenedor.getNum1(), contenedor.getNum2(), contenedor.getOperacion()));

        
        Vista.imprimir(contenedor);

    }

    public static float realizarOperacion(float num1, float num2, int op) {

        float resultado = 0;

        switch (op) {

            case 1:
                resultado = (num1 + num2);
                break;
            case 2:
                resultado = (num1 - num2);
                break;
            case 3:
                resultado = (num1 * num2);
                break;
            case 4:
                resultado = (num1 / num2);
                break;

            default:
                JOptionPane.showMessageDialog(null, "Introduzca una opcion valida");
                break;
        }
        return resultado;

    }

}
