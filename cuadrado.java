/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author diego
 */
public class cuadrado {
    private double lado;
    public cuadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }
    
    public void setLado(double lado) {
        this.lado = lado;
    }

    public double Area() {
        return lado * lado;
    }
    
    public double perimetro() {
        return 4 * lado;
    }

    public double getArea() {
        return Area();
    }

    
    public double getPerimetro() {
        return perimetro();
    }
}
