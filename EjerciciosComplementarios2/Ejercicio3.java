package JavaInformatorio2021.EjerciciosComplementarios2;

import java.util.ArrayList;
import java.util.Collections;


public class Ejercicio3 {
    public static void main(String[] args) {
        ArrayList<String> baraja = new ArrayList<String>();
        System.out.println("Cargar baraja francesa, imprimir al derecho, mexclada y al reverso");
        cargaBaraja(baraja);
        System.out.println("Baraja al derecho: "+baraja);
        Collections.reverse(baraja);
        System.out.println("Baraja al revez: "+baraja);
        Collections.sort(baraja);
        System.out.println("Baraja mezclada: "+ baraja);
        

    };

    public static void cargaBaraja(ArrayList<String> baraja) {
        for (int i = 2; i < 15; i++) {
            String x = Integer.toString(i);
            if (i == 11) {
                baraja.add("J");
            } else {
                if (i == 12) {
                    baraja.add("Q");
                }
                else {
                    if (i == 13) {
                        baraja.add("K");
                    } else {
                        if (i == 14) {
                            baraja.add("A");
                        } else {
                            baraja.add(x);
                        }
                    }
                    ;
                }
                ;
            }
            ;
        }
    }
}
