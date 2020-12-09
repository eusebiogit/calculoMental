package operacion;

import calculomental.CalculoMental;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ordenador
 */
public class Suma {

    private int cifras[];
    private int solucion = -1;

    public Suma(int cantidad) {
        this.cifras = new int[cantidad];
        this.rellenarCifras();

    }

    public Suma() {
        this.cifras = new int[100];
        this.rellenarCifras();
    }

    public void ejecutar() {
        int respuesta;
        Scanner reader = new Scanner(System.in);
        long tiempo1 = System.currentTimeMillis() / 1000;
        System.out.println(this + "\n");
        respuesta = reader.nextInt();
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

    private void rellenarCifras() {
        Random random = new Random();
        int cifra;
        for (int i = 0; i < this.cifras.length; i++) {
            cifra = random.nextInt(8) + 1;
            this.cifras[i] = cifra;

        }
    }

    public int getSolucion() {
        int s = 0;
        if (this.solucion == -1) {
            for (int i = 0; i < this.cifras.length; i++) {
                s += this.cifras[i];
            }
            this.solucion = s;
        }
        return this.solucion;
    }

    public String toString() {
        String r = "";
        for (int i = 0; i < this.cifras.length; i++) {
            r += (i + 1) % 10 == 0 ? this.cifras[i] + "\n\n" : this.cifras[i] + "  ";
        }
        return r;
    }

}
