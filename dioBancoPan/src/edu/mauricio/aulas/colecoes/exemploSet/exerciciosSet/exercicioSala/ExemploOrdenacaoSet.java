package edu.mauricio.aulas.colecoes.exemploSet.exerciciosSet.exercicioSala;

import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class ExemploOrdenacaoSet {

    public static void main(String[] args) {
        Set <Serie> minhasSeries = new HashSet<>() {{
            add(new Serie("Got", "Fantasia", 60));
            add(new Serie("Dark", "Drama", 60));
            add(new Serie("That '70s Show", "Comedia", 25));
        }} ;
        System.out.println(" ");
        System.out.println("--\tOrdem Aleatória\t--");
        System.out.println(minhasSeries);
        System.out.println(" ");
        for (Serie serie : minhasSeries) System.out.println(serie); 
        System.out.println(" ");
        
        for (Serie serie : minhasSeries) System.out.println(serie.getNome() + ", - " + serie.getGenero()
        + ", - " + serie.getTempoEpisodio());
        System.out.println(" ");
        
        System.out.println("Ordem de inserção:");
        Set<Serie> minhaSeries2 = new LinkedHashSet<>(){{
            add(new Serie("Got","Fantasia",60));
            add(new Serie("Dark","Drama",60));
            add(new Serie("That '70s Show","Comedia",25));
        }};
        for (Serie serie : minhaSeries2) System.out.println(serie);
        System.out.println(" ");

        System.out.println("Ordem natural:");
        Set<Serie> minhaSeries3 = new TreeSet<>(minhaSeries2);
        for (Serie serie : minhaSeries3) System.out.println(serie);
        System.out.println(" ");

        System.out.println("Ordem por nome, gênero e tempo de episodio: ");
        Set<Serie> minhaSeries4 = new TreeSet<>(new CompareNomeGeneroTempo());
        minhaSeries4.addAll(minhaSeries2);
        for (Serie serie : minhaSeries4) System.out.println(serie);
        System.out.println(" ");
        

    }
    
}
