package JavaInformatorio2021.EjerciciosComplementarios1;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("impresion de datos de una persona");
        System.out.print("ingrese nombre y apellido: ");
        String nombre = scan.nextLine();
        System.out.print("ingrese edad: ");
        String direccion = scan.nextLine();
        System.out.print("ingrese direccion: ");
        String ciudad = scan.nextLine();
        System.out.print("ingrese ciudad: ");
        String edad = scan.nextLine();
        System.out.print(ciudad + " - " + direccion + " - " + edad + " - " + nombre);
        scan.close();
    }
}
