package calculomental;

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
        int cantidad = 100;
        int argumentos = args.length;
        
        
        if (argumentos == 1) {
            try {
                cantidad = Integer.parseInt(args[0]);
            } catch (Exception e) {

            }
        }

        Scanner reader = new Scanner(System.in);
        Suma s = new Suma(cantidad);
        long tiempo1 = System.currentTimeMillis() / 1000;
        System.out.println(s);
        System.out.println();
        int respuesta = reader.nextInt();
        long tiempo2 = System.currentTimeMillis() / 1000;
        if (respuesta == s.getSolucion()) {
            System.out.println("Correcto");
            System.out.println("tiempo: " + (tiempo2 - tiempo1));
        } else {
            System.out.println("Incorrecto");
            System.out.println("Solucion " + s.getSolucion());
            System.out.println("tiempo: " + (tiempo2 - tiempo1));
        }

    }

}
