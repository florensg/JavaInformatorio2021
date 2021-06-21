package JavaInformatorio2021.EjerciciosComplementarios2;

import java.util.ArrayList;
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);
        ArrayList<String> alumnos = new ArrayList<String>();
        System.out.println("Cargar 12 alumnos en un arreglo y dividirlo en 3 arreglos mas");
        for (int i = 0; i < 12; i++) {
            System.out.print("Escriba el nombre de un alumno #"+(i+1)+": ");
            alumnos.add(scan.nextLine());
        };
        
        System.out.println("Primer curso: "+alumnos.subList(0,4));
        System.out.println("Segundo curso: "+alumnos.subList(4,8));
        System.out.println("Tercer curso: "+alumnos.subList(8,12));
        scan.close();
    }
}
