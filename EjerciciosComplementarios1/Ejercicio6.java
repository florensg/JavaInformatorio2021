package JavaInformatorio2021.EjerciciosComplementarios1;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Potencia de un numero sin usar librerias");
        
        System.out.print("ingrese un numero: ");
        int numero = scan.nextInt();
        
        System.out.print("ingrese la potencia: ");
        int potencia = scan.nextInt();
        
        int resultado = numero;

        for(int i=1; i<potencia;i++){
            resultado = resultado*numero;
            System.out.println(resultado);
        }

        System.out.println(numero+" elevado a la "+numero+" = "+resultado);
        
        scan.close();
    }
}
