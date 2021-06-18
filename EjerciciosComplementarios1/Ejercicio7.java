package JavaInformatorio2021.EjerciciosComplementarios1;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Convertir un texto de minusculas a mayusculas sin usar librerias de Uppercase");
        System.out.println("Ingrese una frase o palabra");
        String texto = scan.nextLine();
        char[] minusculas = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'ñ', 'o', 'p', 'q',
                'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
        char[] mayusculas = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'Ñ', 'O', 'P', 'Q',
                'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
        for (int i = 0; i < minusculas.length; i++) {
            texto = texto.replace(minusculas[i], mayusculas[i]);
        }
        ;
        System.out.println("texto en mayusculas: " + texto);
        scan.close();
    }
}
