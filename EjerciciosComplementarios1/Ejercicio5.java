package JavaInformatorio2021.EjerciciosComplementarios1;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        System.out.println("multiplicacion de dos numeros con sumas sucesivas");
        System.out.print("ingrese un numero: ");
        Scanner scan = new Scanner(System.in);
        int numero1 = scan.nextInt();
        System.out.print("ingrese el segundo numero: ");
        int numero2 = scan.nextInt();
        int resultado = 0;
        for (int i = 1; i <= numero2; i++) {
            resultado = resultado + numero1;
        }
        System.out.print(numero1 + " x " + numero2 + " = " + resultado);
        scan.close();
    }
}