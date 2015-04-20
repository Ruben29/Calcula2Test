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

        float n1 = Float.parseFloat(JOptionPane.showInputDialog("Número 1"));
        contenedor.setNum1(n1);

        float n2 = Float.parseFloat(JOptionPane.showInputDialog("Número 2"));
        contenedor.setNum2(n2);

        String caso = JOptionPane.showInputDialog("Introduzca lo que desea hacer:"
                + "\n 1- Sumar."
                + "\n 2- Restar."
                + "\n 3- Multiplicar."
                + "\n 4- Dividir"
                + "\n 5- Salir");

        contenedor.setOperacion(op);

        float res = realizaOperacion(contenedor.getNum1(), contenedor.getNum2(), contenedor.getOperacion());
        contenedor.setResultado(res);

        Vista.imprimir(contenedor);

    }

    public float realizarOperacion(Modelo contenedor) {

        float resultado = 0;

        Modelo cal = new Modelo();
        Vista resu = new Vista();

        cal.setNum1(29);
        cal.setNum2(21);
        cal.setOperacion("Resta");

        do {

            switch (Integer.parseInt(caso)) {

                case 1:
                    cal.setNum1(29);
                    break;

                case 2:
                    obj1.darBaixa();
                    break;
                case 3:
                    obj1.buscarAlumno();
                    break;
                case 4:
                    aux = true;
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Introduzca una opcion valida");
                    break;
            }

        } while (aux == false);

        /*if (contenedor.operacion.equals("Suma")) {

         contenedor.resultado = contenedor.num1 + contenedor.num2;

         } else if (contenedor.operacion.equals("Resta")) {

         contenedor.resultado = contenedor.num1 - contenedor.num2;

         } else if (contenedor.operacion.equals("Multiplicación")) {

         contenedor.resultado = contenedor.num1 * contenedor.num2;

         } else if (contenedor.operacion.equals("División")) {

         contenedor.resultado = contenedor.num1 / contenedor.num2;

         }*/
        return resultado;

    }

}
