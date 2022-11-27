import java.lang.String;
import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

    }
    public class Persona
    {
        public String getNombre() {
            return Nombre;
        }

        public void setNombre(String nombre) {
            Nombre = nombre;
        }


        public int getEdad() {
            return CalculusFechas.CalcularAnios(FechaNacimiento);
        }

        public void setEdad(int edad) {
            Edad = edad;
        }

        public int getAniosTrabajando() {
            return CalculusFechas.CalcularAnios(FechaContratacion);
        }

        public void setAniosTrabajando(int aniosTrabajando) {
            AniosTrabajando = aniosTrabajando;
        }

        public LocalDate getFechaNacimiento() {
            return FechaNacimiento;
        }

        public void setFechaNacimiento(LocalDate fechaNacimiento) {
            FechaNacimiento = fechaNacimiento;
        }

        public LocalDate getFechaContratacion() {
            return FechaContratacion;
        }

        public void setFechaContratacion(LocalDate fechaContratacion) {
            FechaContratacion = fechaContratacion;
        }

        public String Nombre;

        public LocalDate FechaNacimiento;


        public LocalDate FechaContratacion;

        public int Edad;


        public int AniosTrabajando;

    }
    public static class CalculusFechas
    {
        public static int CalcularAnios(LocalDate fechainicio)
        {
            int edad = LocalDate.now().getYear() - fechainicio.getYear();

            return edad;
        }
    }
}