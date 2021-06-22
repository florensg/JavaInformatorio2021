package JavaInformatorio2021.EjerciciosComplementarios2.Ejercicio6;

import java.util.*;

public class EjercicioSeis {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Set<Empleado> setEmpleado = new HashSet<>();
        Boolean respuesta = true;
        String respuesta1 = "s";
        while (respuesta){
            if (respuesta1.equals("s")){
                cargaSetEmpleados(setEmpleado);
            }
            else
            {
                respuesta = false;
            }
            System.out.println("si desea cargar un empleado presione S/N ");
            respuesta1 = scan.next();
        }
        
        System.out.println("Listado de empleados");
        for (Empleado empl:setEmpleado){
            System.out.println("NOMBRE Y APELLIDO: "+empl.nombreApellido +" DNI: "+empl.dni+" HORAS TRABAJADAS: "+empl.horasTrabajadas+" VALOR POR HORAS DE TRABAJO: "+empl.valorPorHora);
        }
        Map<Integer, Integer> diccionarioSueldo = new HashMap<Integer, Integer>();
        for (Empleado empleado:setEmpleado){
            diccionarioSueldo.put(empleado.getDni(),(empleado.getHorasTrabajadas()*empleado.valorPorHora));
        }
        System.out.print(diccionarioSueldo);
        scan.close();
    }

    public static void cargaSetEmpleados(Set<Empleado> setEmpleado) {  
        Scanner scan = new Scanner(System.in);
        System.out.println("ingrese los datos del empleado: ");
        Empleado empleado = new Empleado();
        System.out.println("nombre y apellido: ");
        empleado.setNombreApellido(scan.nextLine());
        System.out.println("dni: ");
        empleado.setDni(scan.nextInt());
        System.out.println("horas trabajadas: ");
        empleado.setHorasTrabajadas(scan.nextInt());
        System.out.println("valor por hora de trabajo: ");
        empleado.setValorPorHora(scan.nextInt());
        setEmpleado.add(empleado); 
    }
}
