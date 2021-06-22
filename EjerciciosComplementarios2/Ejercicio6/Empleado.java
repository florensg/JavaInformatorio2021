package JavaInformatorio2021.EjerciciosComplementarios2.Ejercicio6;

public class Empleado{
    String nombreApellido;
    int dni;
    int horasTrabajadas;
    int valorPorHora;

    public Empleado(){
        
    }
    public void setNombreApellido(String nombreApellido){
        this.nombreApellido = nombreApellido;
    }
    public void setDni(int dni){
        this.dni = dni;
    }
    public void setHorasTrabajadas(int horasTrabajadas){
        this.horasTrabajadas = horasTrabajadas;
    }
    public void setValorPorHora(int valorPorHora){
        this.valorPorHora = valorPorHora;
    }


    public String getNombreApellido() {
        return this.nombreApellido;
    }
    public int getDni() {
        return this.dni;
    }
    public int getHorasTrabajadas() {
        return this.horasTrabajadas;
    }
    public int getValorPorHora() {
        return this.valorPorHora;
    }


    @Override
    public String toString() {
        return "{" +
            " nombreApellido='" + getNombreApellido() + "'" +
            ", dni='" + getDni() + "'" +
            ", horasTrabajadas='" + getHorasTrabajadas() + "'" +
            ", valorPorHora='" + getValorPorHora() + "'" +
            "}";
    }
    
    
}