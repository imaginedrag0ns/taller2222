
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author diego
 */
public class Persona {

    private String nombre;
    private LocalDate fechaNacimiento;

    
    
    public Persona(String nombre, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    
    public Edad calcular() {
        LocalDate hoy = LocalDate.now();
       
        long años = ChronoUnit.YEARS.between(fechaNacimiento, hoy);
        long meses = ChronoUnit.MONTHS.between(LocalDate.of(hoy.getYear(), fechaNacimiento.getMonth(), fechaNacimiento.getDayOfMonth()), hoy);
        long dias = ChronoUnit.DAYS.between(LocalDate.of(hoy.getYear(), hoy.getMonth(), fechaNacimiento.getDayOfMonth()), hoy);   
        return new Edad(años, meses, dias);
    }
    public Edad getEdad() {
        return calcular();
    }

  
    public void setFechaNacimiento(int año, int mes, int dia) {
        this.fechaNacimiento = LocalDate.of(año, mes, dia);
    }

    private static class Edad {

        public Edad() {
        }

        private Edad(long años, long meses, long dias) {
            throw new UnsupportedOperationException("Not supported yet."); 
        }
    }
    


}     

