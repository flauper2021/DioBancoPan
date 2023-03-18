package edu.mauricio.aulas.sintaxeJava.operadores;

public class OperadoresTabelaVerdade {

    public static void main(String[] args) {
        
        //Os operadores logicos "E" e "OU" nos permites criar expressões lógicas maiores a partir de junções
        //de duas ou mais expressões lógicas:
        // Operador lógico "E" é representado por "&&";
        // Operador lógico "OU" é representado por "||";

        boolean condicaoUm= true;
        boolean condicaoDois= true;

        if(condicaoUm && condicaoDois){
            System.out.println("\nas condições são verdadeiras\n");
        }else if(condicaoUm || condicaoDois){
            System.out.println("\nUma das condições é verdadeira\n");
        }else{
            System.out.println("\nnenhuma das condições são verdadeiras\n");
        }

        condicaoUm = !condicaoUm;

        if(condicaoUm && condicaoDois){
            System.out.println("\nas condições são verdadeiras\n");
        }else if(condicaoUm || condicaoDois){
            System.out.println("\nUma das condições é verdadeira\n");
        }else{
            System.out.println("\nnenhuma das condições são verdadeiras\n");
        }

        condicaoDois = !condicaoDois;

        if(condicaoUm && condicaoDois){
            System.out.println("\nas condições são verdadeiras\n");
        }else if(condicaoUm || condicaoDois){
            System.out.println("\nUma das condições é verdadeira\n");
        }else{
            System.out.println("\nnenhuma das condições são verdadeiras\n");
        }

    }
    
}
