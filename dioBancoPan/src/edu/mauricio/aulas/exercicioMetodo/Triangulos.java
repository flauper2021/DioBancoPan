package edu.mauricio.aulas.exercicioMetodo;

public class Triangulos {
        /*
     * Um triângulo é chamado de equilátero se todos os lados possuem a mesma medida. 
     * Um triângulo é chamado de isósceles se dois lados possuem a mesma medida. 
     * Um triângulo é chamado de escaleno se todos os lados possuem medidas diferentes. 
     * 
     *  
     */

    public static double area(double lado){
        return lado *lado;
    }
    public static double area(double lado1, double lado2){
        return lado1 * lado2;
    }
    public static double area(double baseMaior, double baseMenor, double altura){
        return ((baseMaior+baseMenor)*altura)/2;
    }
    
}