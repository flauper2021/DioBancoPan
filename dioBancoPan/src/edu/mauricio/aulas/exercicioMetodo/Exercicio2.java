package edu.mauricio.aulas.exercicioMetodo;
import java.util.Scanner;

public class Exercicio2 {

    
    public static void main(String[] Args) {

    double h = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite um numero: ");
    double n = sc.nextDouble();

    for (int i = 1; i <= n; i++) {
     //TODO: Calcule o valor de H de forma que resulte na soma dos termos:
        h = h + (double)1/i;
        System.out.println(String.format("%.0f", h));
    
    }
     //TODO: Imprima a soma dos termos, considerando um resultado com duas casas decimais:
    System.out.println(String.format("%.0f", h));   
    }
}

