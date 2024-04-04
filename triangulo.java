/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author diego
 */
public class triangulo {
     private double lado1;
    private double lado2;
    private double lado3;

    public triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public double getLado1() {
        return lado1;
    }
    
    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }
    public double calArea() {
        double semiperimetro = (lado1+lado2+lado3) / 2;
        return Math.sqrt(semiperimetro*(semiperimetro-lado1)*(semiperimetro - lado2)*(semiperimetro - lado3));
    }
    public double calPerimetro() {
        return lado1 + lado2 + lado3;
    }

    public double calHipotenusa() {
        if (esRectangulo()) {
            if (lado1 == lado2) {
                return lado1 * Math.sqrt(2);
            } else if (lado1 == lado3) {
                return lado1 * Math.sqrt(2);
            } else {
                return lado2 * Math.sqrt(2);
            }
        } else {
            
            throw new IllegalArgumentException("El triángulo no es rectángulo");
        }
    }
    
    public boolean esRectangulo() {
        return Math.pow(lado1, 2) + Math.pow(lado2, 2) == Math.pow(lado3, 2) ||
                Math.pow(lado1, 2) + Math.pow(lado3, 2) == Math.pow(lado2, 2) ||
                Math.pow(lado2, 2) + Math.pow(lado3, 2) == Math.pow(lado1, 2);
    }
    
    public double getArea() {
        return calArea();
    }
    
    public double getPerimetro() {
        return calPerimetro();
    }

    public double getHipotenusa() {
        if (esRectangulo()) {
            return calHipotenusa();
        } else {
            throw new IllegalArgumentException("no es un rectangulo el triangolu");
        }
    }
}
