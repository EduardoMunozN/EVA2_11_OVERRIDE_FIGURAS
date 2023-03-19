/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva2_11_overrride_figuras;

/**
 *
 * @author eduar
 */
public class EVA2_11_OVERRRIDE_FIGURAS {

    public static void main(String[] args) {
        circulo circulo1 = new circulo(10);
        System.out.println("ÁREA: "+circulo1.calcularArea());
        System.out.println("PERIMETRO:"+circulo1.calcularPerimetro());
        
              
    }
}
class figura{

    public figura() {
    }
    
    public double calcularArea(){
        return -1;
    }

    public double calcularPerimetro(){
        return -1;
    }
    
    
}
class triangulo{
    private double altura;
    private double base;
    

    public triangulo() {
    }

    public triangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
    public double calcularArea(){
        return (base * altura)/2;
    }
    public double calcularPerimetro(){
        return (base * base)+ (altura * altura);
    }
    @Override
    public String toString(){
        String cade = "DATOS: \n"+
                "ÁREA TRIÁNGULO:  \n"+
                "PERÍMETRO TRIÁNGULO: \n";
                return cade;
    }
    
    
}
class circulo extends figura{
    private double radio;

    public circulo() {
    }

    public circulo(double radio) {
        this.radio = radio;
    }
    
    

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    @Override
    public double calcularArea (){
        return Math.PI * (radio * radio);
    }
    @Override
    public double calcularPerimetro(){
        return Math.PI * (radio * 2);
    }
    public String toString(){
        String cade = "DATOS: \n"+
                "ÁREA CIRCULO: \n"+
                "PERÍMETRO CIRCULO: \n";
                return cade;
    }
    
}