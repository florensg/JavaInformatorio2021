package JavaInformatorio2021.EjerciciosComplementarios1;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] srgs) {
        System.out.print("ingrese un numero: ");
        Scanner scan = new Scanner(System.in);
        int numero = scan.nextInt();
        String num = "";
        for (int i = 1; i <= numero; i++) {
            System.out.println(num += i + " ");
        }
        scan.close();
    }
}
