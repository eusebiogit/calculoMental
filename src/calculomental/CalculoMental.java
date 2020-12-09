package calculomental;

import operacion.*;
import java.util.Scanner;

/**
 *
 * @author ordenador
 */
public class CalculoMental {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int argumentos = args.length;
        if (argumentos > 0) {
            String operacion = args[0];
            switch (operacion) {
                case "s":
                    Suma s;
                    if (argumentos > 1) {
                        s = new Suma(Integer.parseInt(args[1]));
                    } else {
                        s = new Suma(100);
                    }
                    s.ejecutar();
                    break;
                case "m":
                    Producto p;
                    switch (argumentos) {
                        case 1:
                            p = new Producto(2);
                            break;
                        case 2:
                            p = new Producto(Integer.parseInt(args[1]));
                            break;
                        case 3:
                            p = new Producto(Integer.parseInt(args[1]),Integer.parseInt(args[2]));
                            break;
                        default:
                            p = new Producto(8);
                            break;
                    }
                    p.ejecutar();
                    break;
                case "h":
                default:
                    ayuda();
            }
        }else{
            ayuda();
        }
    }

    
    

    private static void ayuda() {
        String ayuda = "Uso: calculoMental [operacion|ayuda] [opciones]\n"
                + "Operacion: \n"
                + "\ts: Suma\n"
                + "\t\tOpciones:\n"
                + "\t\t\tN: Cantidad de numeros para sumar\n"
                + "\tm: Multiplicacion\n"
                + "\t\tOpciones:\n"
                + "\t\t\tN: Cantidad de digitos en cada número\n"
                + "\t\t\tEjemplo: calculoMental m 2 3\n"
                + "\t\t\t22 X 333\n"
                + "\t\t\tEjemplo: calculoMental m 2\n"
                + "\t\t\t22 X 22\n"
                + "Ayuda: \n"
                + "\th: ayuda\n";
        System.out.println(ayuda);
    }

}
