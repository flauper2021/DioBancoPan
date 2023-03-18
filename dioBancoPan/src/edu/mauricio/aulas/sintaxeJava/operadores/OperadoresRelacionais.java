package edu.mauricio.aulas.sintaxeJava.operadores;

import java.nio.channels.ShutdownChannelGroupException;

public class OperadoresRelacionais {

    public static void main(String[] args) {
        
        /* Operadores Relacionais:

    São operadores lógicos na qual vai verificar uma condição logica.

    São alguns deles:

    ' == ' significa igualdade;
    ' != ' significa diferente;
    ' < ' significa menor que;
    ' > ' significa maior que;
    ' <= ' significa menor ou igual;
    ' >= ' significa maior ou igual;

    */

    int numeroUm = 1, numeroDois = 2;
    boolean simNao = numeroUm == numeroDois;
    
    System.out.println("\nNumero um é igual ao numero dois? " + simNao);

    simNao = numeroUm != numeroDois;
    System.out.println("Numero um é diferente ao numero dois? " + simNao);

    simNao = numeroUm > numeroDois;
    System.out.println("Numero um é maior ao numero dois? " + simNao);

    simNao = numeroUm < numeroDois;
    System.out.println("Numero um é menor ao numero dois? " + simNao);

    simNao = numeroUm >= numeroDois;
    System.out.println("Numero um é maior ou igual ao numero dois? " + simNao);

    simNao = numeroUm <= numeroDois;
    System.out.println("Numero um é menor ou igual ao numero dois? " + simNao +"\n");

    // junto com o if se estabelece condições logicas e podesse determinar situações diferentes para cada cenário:

    if(numeroUm == numeroDois){
        System.out.println("A condição é verdadeira.\n");
    }else{
        System.out.println("A condição é falsa.\n");
    }

    // no caso de fazer comparaçãoes logicas:

    String nomeUm = "JUAN", nomeDois = "JUAN";


    System.out.println("O nome um é igual ao nome dois? " + (nomeUm==nomeDois));
    

    String nomeTres = new String("JUAN");

    System.out.println("O nome um é igual ao nome três? " + (nomeUm==nomeTres)+"\n");

    //quando se compara caracteres, muitas vezes pode ser que se quer comparar objetos diferentes
    // dessa maneira a forma mais segura de se coparar é com a utilização de .equals():

    System.out.println("\nO nome um é igual ao nome dois? " + nomeUm.equals(nomeTres)+"\n");


    }
    
}
