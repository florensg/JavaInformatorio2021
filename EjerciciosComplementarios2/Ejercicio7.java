package JavaInformatorio2021.EjerciciosComplementarios2;

import java.util.*;

public class Ejercicio7 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese el numero con el que inicia la secuencia: ");
        int n1 = scan.nextInt();
        System.out.print("Ingrese el numero con el que termina la secuencia: ");
        int n2 = scan.nextInt();
        System.out.print(fizzBuzzFuncion(n1, n2));

        scan.close();
    }
    
    public static ArrayList<String> fizzBuzzFuncion(int numero1, int numero2) {
        ArrayList<String> fizzbuzz = new ArrayList<String>();
        for (int i = numero1; i < numero2; i++) {
            if (i % 2 == 0){
                fizzbuzz.add("Fizz");
            }
            else
            {
                if (i % 3 == 0){
                    fizzbuzz.add("Buzz");
                }
                else
                {
                    if ((i % 2 == 0) && (i % 3 == 0)){
                        fizzbuzz.add("FizzBuzz");
                    }
                    else
                    {
                        fizzbuzz.add(Integer.toString(i));
                    }
                }
            }
        }
        return fizzbuzz;
    }
}
