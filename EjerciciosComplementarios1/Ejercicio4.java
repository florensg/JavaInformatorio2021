package JavaInformatorio2021.EjerciciosComplementarios1;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        System.out.print("ingrese un numero: ");
        Scanner scan = new Scanner(System.in);
        int numero = scan.nextInt();
        System.out.println("el factorial de "+ numero +" es: "+factorial(numero)); 
        scan.close();
    }

    public static int factorial(int numero) {
        int resultado = numero;
        if (numero != 1) {
            resultado = resultado * factorial(numero - 1);
        }
        return resultado;
    }
}