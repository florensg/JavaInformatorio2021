package JavaInformatorio2021.EjerciciosComplementarios2;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Crear un arreglo, agregar 5 elementos, luego uno al principio y otro al final. Mostrar el tamaño antes y despues de agregar los ultimos dos");
        System.out.println("Ingrese 5 numeros enteros: ");
        
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        
        for (int i = 0; i < 5; i++) {
            System.out.print("#"+(i+1)+": ");
            numeros.add(scan.nextInt());
        }
        
        System.out.println("tamaño del arreglo de numeros: "+numeros.size());
        System.out.print("ingrese un numero para agregar al principio del arreglo: ");
        numeros.add(0, scan.nextInt());
        System.out.println(numeros);
        System.out.println("tamaño del arreglo luego de agregar un numero al principio: "+numeros.size());
        System.out.print("ingrese un numero para agregar al final del arreglo: ");
        numeros.add(scan.nextInt());
        System.out.println(numeros);
        System.out.println("tamaño del arreglo luego de agregar un numero al final: "+numeros.size());


        scan.close();
    }
}
