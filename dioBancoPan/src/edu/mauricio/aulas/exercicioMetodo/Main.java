package edu.mauricio.aulas.exercicioMetodo;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nBOM DIA!");
        Calculadora.soma(10, 5);
        Calculadora.subtracao(10, 5);
        Calculadora.divisao(10, 5);
        Calculadora.multiplicacao(10, 5);

        System.out.println(Triangulos.area(12));
        System.out.println(Triangulos.area(10,12));
        System.out.println(Triangulos.area(12,6,12));
        System.out.println("\nFim do Programa!\n");
        
    }
    
}
