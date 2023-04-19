package edu.mauricio.aulas.colecoes;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ExemploList {

    public static void main(String[] args) {
        
        //Dada uma lista com 7 notas de um aluno, faça: [7, 8.5, 9.3, 5, 7, 0, 3.6]

        // List <Double> notas = Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6); ou
        // List <Double> notas = List.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6); são listas estaticas,
        // não permitindo adicionar ou retirar elementos da lista;

        // ArrayList<Double> notas = new ArrayList<>(); geralmente não se usa, já que a programação 
        // e voltado para a interface e não para a implementação.
        // podia fazer assim também para criar a ArrayList:
        // List<Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));

        List<Double> notas = new ArrayList<>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5d);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        System.out.println(" ");
        System.out.println(notas);
        System.out.println(" ");
        System.out.println(notas.toString());
        System.out.println(" ");

        for (Double nota : notas) System.out.println(nota);

        System.out.println(" ");
        System.out.println("Exiba a posição da nota '5' é: " + notas.indexOf(5.0));
        System.out.println(" ");

        System.out.println(notas);
        System.out.println("Adicione na lista o numero 8.0 na posição 4: ");
        notas.add(4, 8.0);
        System.out.println(notas);
        System.out.println(" ");

        System.out.println("Adicione a nota 6.0 no lugar da nota 5.0: ");
        notas.set(notas.indexOf(5.0), 6.0);
        System.out.println(notas);
        System.out.println(" ");

        System.out.println("Confira se a nota 5.0 continua na lista: " + notas.contains(5.0));
        System.out.println(" ");

        System.out.println("Confira qual é a terceira nota adicionada? ");
        System.out.println("A terceira nota adicionada é: "+ notas.get(2));
        System.out.println(" ");

        System.out.println("Exiba a menor nota: ");
        System.out.println("A menor nota é: "+ Collections.min(notas));
        System.out.println(" ");

        System.out.println("E qual é a maior nota? ");
        System.out.println("A maior nota é: "+ Collections.max(notas));
        System.out.println(" ");

        System.out.println("Exiba a soma das notas:");
        // o iterator trabalha como se fosse o cursor dentro da lista, iniciando antes do primeiro
        // numero. quando usa hasNext (que ingles traduzindo representa "tem proximo"), ex:(|7.0, 8.5))
        // verificando se tem algum elemento da lista na posição que ele se encontra.
        Iterator<Double> iterator = notas.iterator();
        double soma = 0.0;

        while(iterator.hasNext()){
            double next = iterator.next();
            soma += next;
        }
        System.out.println("A soma das notas é: "+soma);
        System.out.println(" ");

        System.out.println("E quanto é a media das notas? ");
        System.out.println("A media das notas é: "+ soma/notas.size());
        System.out.println(" ");

        System.out.println(notas);
        //aqui ele remove o elemento adicionado;
        notas.remove(0.0);
        System.out.println(" ");
        System.out.println(notas);
        //aqui ele remove o elemento da posição indicada;
        notas.remove(0);
        System.out.println(" ");
        System.out.println(notas);
        System.out.println(" ");

        System.out.println("Remova todas as notas abaixo de 7.0");

        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()){
            Double next = iterator1.next();
            if(next < 7) iterator1.remove();
        }
        System.out.println(notas);
        System.out.println(" ");

        System.out.println("Apague toda a lista");
        notas.clear();

        System.out.println("A lista 'notas' esta vazia: " + notas.isEmpty());
        System.out.println(" ");
        
    }
    
}
