package JavaInformatorio2021.EjerciciosComplementarios2;

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio5 {
    
    public static void main(String[] args) {

        ArrayList<Integer> horasTrabajadas = new ArrayList<Integer>();
        ArrayList<Integer> valorPorHora = new ArrayList<Integer>();
        ArrayList<Integer> totalPorDia = new ArrayList<Integer>();

        System.out.println("cargar dos arreglos, uno con horas trabajadas y otro con el valor de las horas, calcular el costo por dia y el monto total a cobrar");

        cargaArreglos(horasTrabajadas, valorPorHora);
        Collections.sort(valorPorHora);
        calculoTotales(horasTrabajadas, valorPorHora, totalPorDia);
        System.out.println("Horas trabajadas por semana: "+horasTrabajadas);
        System.out.println("Valor de horas trabajadas: "+valorPorHora);
        System.out.println("Total por hora trabajadas por semana: "+valorPorHora);
        System.out.println("Total a cobrar: $"+totalGeneral(totalPorDia));


    }

    public static void cargaArreglos(ArrayList<Integer> horasTrabajadas, ArrayList<Integer> valorPorHora) {
        for (int i = 0; i < 5; i++) {
            horasTrabajadas.add((int) (Math.random() * 48) + 1);
        }
        ;
        for (int i = 0; i < 5; i++) {
            valorPorHora.add((int) (Math.random() * 600) + 100);
        }
        ;

    };

    public static void calculoTotales(ArrayList<Integer> horasTrabajadas, ArrayList<Integer> valorPorHora,
            ArrayList<Integer> totalPorDia) {
        for (int i = 0; i < 5; i++) {
            totalPorDia.add(horasTrabajadas.get(i) * valorPorHora.get(i));
        }
    }
    public static int totalGeneral(ArrayList<Integer> totalPorDia) {
        int total = 0;
        for (int i = 0; i < totalPorDia.size(); i++) {
            total += totalPorDia.get(i);
        }
        return total;
    }
}
