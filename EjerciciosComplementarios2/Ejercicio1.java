package JavaInformatorio2021.EjerciciosComplementarios2;

import java.util.ArrayList;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Crear y cargar un array con las ciudades favoritas de Argentina");

        ArrayList<String> ciudadesFavoritas = new ArrayList<String>();

        System.out.print("Ingrese su ciudad favorita: ");
        
        String ciudad = " ";
        boolean respuesta = true;

        ciudad = scan.nextLine();
        ciudadesFavoritas.add(ciudad);

        while (respuesta) {
            System.out.println("Si desea seguir ingresando ciudades presione 's' sino 'n' ");
            ciudad = scan.nextLine();

            if (ciudad.equals("s")) {
                System.out.println("Ingrese su ciudad favorita: ");
                ciudad = scan.nextLine();
                ciudadesFavoritas.add(ciudad);
            } 
            else 
            {
                if (ciudad.equals("n")) {
                    respuesta = false;
                }
            };

            
        }
        ;

        for (int i = 0; i < ciudadesFavoritas.size(); i++) {
            System.out.println("#" + (i + 1) + " - " + ciudadesFavoritas.get(i));
        }
        ;
        scan.close();
    }
}
