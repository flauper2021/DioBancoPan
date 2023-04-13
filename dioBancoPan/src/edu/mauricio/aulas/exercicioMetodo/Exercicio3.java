package edu.mauricio.aulas.exercicioMetodo;
import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int N = leitor.nextInt();
        int proximo, anterior = 0, atual = 1;
        for (int i = 1; i <= N; i++) {
            if (i == N) System.out.println(anterior);

     //TODO: Implemente a condição ideal para que possamos obter os valores solicitados:
        	else System.out.print(anterior + " ");
        	proximo = anterior + atual;
        	anterior = atual; 
        	atual =  proximo; 
        }
    }
    
}
