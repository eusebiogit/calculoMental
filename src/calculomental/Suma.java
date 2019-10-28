package calculomental;

import java.util.Random;

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
