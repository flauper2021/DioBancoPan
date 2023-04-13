package edu.mauricio.aulas.exercicioMetodo;

public class Calculadora {


    public static void soma(int numeroUm, int numeroDois){
        
        int resultadoSoma = numeroUm + numeroDois;
        System.out.println("\nO resultado da soma dos numeros é: "+resultadoSoma);
    }
    
    public static void subtracao(int numeroUm, int numeroDois){
        int resultadoSubt = numeroUm - numeroDois;
        System.out.println("\nO resultado da subtração dos numeros é: "+resultadoSubt);
    }
    
    public static void multiplicacao(int numeroUm, int numeroDois){
        int resultadoMult = numeroUm * numeroDois;
        System.out.println("\nO resultado da multiplicação dos numeros é: "+resultadoMult);
    }

    public static void divisao(int numeroUm, int numeroDois){
        int resultadoDivi = numeroUm / numeroDois;
        System.out.println("\nO resultado da divisão dos numeros é: "+resultadoDivi);
    }
    
}
