package JavaInformatorio2021.EjerciciosComplementarios1;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);
        System.out.print("Contar la cantidad de veces que aparece una letra en un texto ingresado por teclado");
        System.out.print("Ingrese un texto: ");
        String entrada = scan.nextLine();
        System.out.print("Ingrese letra que desea saber la cantidad existente: ");
        char letra = scan.next().charAt(0);
        int contador = 0;
        for (int i = 0; i < entrada.length(); i++) {
            if (entrada.charAt(i) == letra) {
                contador++;
            }
        }
        System.out.print("Se encontraron: "+contador+" "+letra);
        scan.close();
    }
}
