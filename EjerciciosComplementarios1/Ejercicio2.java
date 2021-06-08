package JavaInformatorio2021.EjerciciosComplementarios1;
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args){
        System.out.print("ingrese un numero: ");
        Scanner scan = new Scanner(System.in);
        int numero1 = scan.nextInt();
        System.out.print("Ingrese otro numero: ");
        int numero2 = scan.nextInt();
        System.out.println("suma:   " + numero1 + " + " + numero2 + " = " + suma(numero1,numero2));
        System.out.println("resta:  " + numero1 + " - " + numero2 + " = " + resta(numero1,numero2));
        System.out.println("multiplicacion:     " + numero1 + " * " + numero2 + " = " + multiplicacion(numero1,numero2));
        System.out.println("division:   " + numero1 + " / " + numero2 + " = " + division(numero1,numero2));
        System.out.println("modulo:     " + numero1 + " % " + numero2 + " = " + modulo(numero1,numero2));
        scan.close();
    }
    public static int suma(int num1,int num2){
        return num1 + num2;
    };
    public static int resta(int num1,int num2){
        return num1 - num2;
    };
    public static int multiplicacion(int num1,int num2){
        return num1 * num2;
    };
    public static int division(int num1,int num2){
        return num1 / num2;
    };
    public static int modulo(int num1,int num2){
        return num1 % num2;
    };
}
