package JavaInformatorio2021.EjerciciosComplementarios1;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args){
        System.out.println("ingrese su nombre");
        String nombre = "";
        Scanner nombreEntrada = new Scanner(System.in);
        nombre = nombreEntrada.nextLine();
        System.out.println("HOLA "+nombre+"!!!"); 
        nombreEntrada.close();
    }
}
