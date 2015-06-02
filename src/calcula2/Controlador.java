package calcula2;

/**
 *
 * @author rfernandezgonzalez
 */
public class Controlador {

    public static float realizaOperacion(Modelo contenedor) {
        float resultado = 0;
        switch (contenedor.getOperacion()) {
            case 1:
                resultado = contenedor.getNum1() + contenedor.getNum2();
                break;
            case 2:
                resultado = contenedor.getNum1() - contenedor.getNum2();
                break;
            case 3:
                resultado = contenedor.getNum1() * contenedor.getNum2();
                break;
            case 4:
                resultado = contenedor.getNum1() / contenedor.getNum2();
                break;
            case 5:
                System.exit(0);
                break;

        }
        contenedor.setResultado(resultado);
        return resultado;
    }

}
