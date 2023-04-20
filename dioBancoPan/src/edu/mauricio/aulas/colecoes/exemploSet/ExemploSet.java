package edu.mauricio.aulas.colecoes.exemploSet;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploSet {
    public static void main(String[] args) {
        
        //Dada uma lista com 7 notas de um aluno, crie um conjunto(Set): [7, 8.5, 9.3, 5, 7, 0, 3.6]

        // Set<Double> notas = new HashSet<>()); ou
        // Set <Double> notas = Set.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        
        // HashSet<Double> notas = new HashSet<>(); geralmente não se usa, já que a programação 
        // e voltado para a interface e não para a implementação.
        // podia fazer assim também para criar a HashSet:

        // Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));

        Set <Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        // O HashSet somente adiciona e remove elementos;
        System.out.println(" ");
        System.out.println(notas);
        System.out.println(" ");
        notas.add(1.0);
        System.out.println(notas);
        System.out.println(" ");
        notas.remove(1d);
        System.out.println(notas);
        System.out.println(" ");
        System.out.println(notas.toString());
        System.out.println(" ");

        //for (Double nota : notas) System.out.println(nota);

        System.out.println(" ");
        System.out.println("Exiba a posição da nota '5': ");// + notas.indexOf(5.0));
        System.out.println("O HashSet não possui esse metodo!");
        System.out.println(" ");

        System.out.println(notas);
        System.out.println("Adicione na lista o numero 8.0 na posição 4: ");
        //notas.add(4, 8.0);
        System.out.println("O HashSet não adiciona por posição");
        System.out.println(" ");

        System.out.println("Adicione a nota 6.0 no lugar da nota 5.0: ");
        //notas.set(notas.indexOf(5.0), 6.0);
        System.out.println("O HashSet não possui o metodo indexOf.");
        System.out.println(" ");

        System.out.println("Confira se possi a nota 5.0 na lista: " + notas.contains(5.0));
        System.out.println(" ");

        System.out.println("Confira qual é a terceira nota adicionada? ");
        System.out.println("O HashSet não possui o metodo get. "); //+ notas.get(2));
        System.out.println(" ");

        System.out.println("Exiba a menor nota: ");
        System.out.println("A menor nota é: "+ Collections.min(notas) );
        System.out.println(" ");

        System.out.println("E qual é a maior nota? ");
        System.out.println("A maior nota é: "+ Collections.max(notas) );
        System.out.println(" ");

        System.out.println("Exiba a soma das notas:");
        // o iterator trabalha como se fosse o cursor dentro da lista, iniciando antes do primeiro
        // numero. quando usa hasNext (que ingles traduzindo representa "tem proximo"), ex:(|7.0, 8.5))
        // verificando se tem algum elemento da lista na posição que ele se encontra.

        Iterator <Double> iterator = notas.iterator();
        double soma = 0.0;

        while(iterator.hasNext()){
            double next = iterator.next();
            soma += next;
        }
        System.out.println("A soma do das notas é: "+soma);
        System.out.println(" ");

        System.out.println("E quanto é a media das notas? ");
        System.out.println("A media das notas é: "+ soma/notas.size());
        System.out.println(" ");

        System.out.println("Remova todas as notas abaixo de 7.0");

        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()){
            Double next = iterator1.next();
            if(next < 7) iterator1.remove();
        }
        System.out.println(notas);
        System.out.println(" ");

        System.out.println("Exiba todas as notas na ordem que foram informadas:");
        Set<Double> notas2 = new LinkedHashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas2);
        System.out.println(" ");

        System.out.println("Exiba todas as notas na ordem crescente:");
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);

        System.out.println("Apague toda a lista notas.");
        notas.clear();

        System.out.println("A lista 'notas' esta vazia: " + notas.isEmpty());
        System.out.println("A lista 'notas2' esta vazia: " + notas2.isEmpty());
        System.out.println("A lista 'notas3' esta vazia: " + notas3.isEmpty());
        
        System.out.println(" ");
        
    }
    
}
