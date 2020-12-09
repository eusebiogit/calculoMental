package operacion;

import calculomental.CalculoMental;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ordenador
 */
public class Producto {

    private int cifras[];
    private long operadores[];

    public Producto(int cifras) {
        this(cifras, cifras);
    }

    public Producto(int cifras1, int cifras2) {
        this.cifras = new int[]{cifras1, cifras2};
        this.operadores = new long[2];
        generarOperadores();
    }

    public void ejecutar() {
        long respuesta;
        Scanner reader = new Scanner(System.in);
        long tiempo1 = System.currentTimeMillis() / 1000;
        System.out.println(this + "\n");
        respuesta = reader.nextLong();
        long tiempo2 = System.currentTimeMillis() / 1000;
        if (respuesta == this.getSolucion()) {
            System.out.println("Correcto");
            System.out.println("tiempo: " + (tiempo2 - tiempo1));
        } else {
            System.out.println("Incorrecto");
            System.out.println("Solucion " + this.getSolucion());
            System.out.println("tiempo: " + (tiempo2 - tiempo1));
        }

    }

    public long getSolucion() {
        return this.operadores[0] * this.operadores[1];
    }

    private void generarOperadores() {
        int cifra;
        String numero = "";
        for (int i = 0; i < this.cifras.length; i++) {
            numero = "";
            cifra = this.cifras[i];
            for (; cifra > 0; cifra--) {
                numero += this.getDigito();
            }
            this.operadores[i] = Long.parseLong(numero);
        }
    }

    private String getDigito() {
        int cifra;
        Random random = new Random();
        cifra = random.nextInt(8) + 1;
        return cifra + "";
    }

    public String toString() {
        return this.operadores[0] + " X " + this.operadores[1];
    }

}
