package edu.mauricio.aulas.colecoes.exemploLista;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class GatoApp{

    public static void main(String[] args) {
        
        List<Gato> meusGatos = new ArrayList<>(){{

            add(new Gato("Jon",18, "preto"));
            add(new Gato("Simba", 6, "tigrado"));
            add(new Gato("Jon", 12, "amarelo"));
            
        }};
    
        System.out.println(" ");
        for (Gato meuGato : meusGatos) System.out.println(meuGato);
        System.out.println(" ");

        System.out.println("Imprima a lista pela ordem de inserção:");
        System.out.println(meusGatos);
        System.out.println(" ");

        System.out.println(" Imprima de forma aleatória:");
        // a List não possui um metodo para realizar isso.
        // usa para fazer esse processo usa Colletions.
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);
        System.out.println(" ");

        System.out.println("Imprima por ordem natural");
        // para funcionar a comparação da colleticons sort, foi necessario implementar na classe gato
        // o metodo comparable (vide classe gato).
        Collections.sort(meusGatos);
        System.out.println(meusGatos);
        System.out.println(" ");

        System.out.println("Imprima por ordem de idade");
        //Collections.sort(meusGatos, new ComparatorIdade());
        meusGatos.sort(new ComparatorIdade());
        System.out.println(meusGatos);
        System.out.println(" ");

        System.out.println("Imprima por ordem de cor");
        Collections.sort(meusGatos, new ComparatorCor());
        //meusGatos.sort(new ComparatorCor());
        System.out.println(meusGatos);
        System.out.println(" ");

        System.out.println("Imprima por ordem de nome, cor e idade");
        meusGatos.sort(new ComparatorNomeCorIdade());
        // Colletions.sort(meusGatos, new ComparatorNomeCorIdade());
        System.out.println(meusGatos);
        System.out.println(" ");

    }    

}
