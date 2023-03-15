package edu.mauricio.aulas.sintaxeJava.anatomiaClasses;
// SINTAXE JAVA:
// recomenda usar a implementação do codigo em inglês, ex: no caso de "MinhaClasse" seria "MyClassi";
// public static void main é um metodo  do java;
// não se usa palavras reservada do programa para nome de variaveis, metodos ou classe, como no Exemplo acima
// onde uso Classi em vez da palavra reservada class;
// toda classe em java começa em MAIUSCULA;
// toda classe tem que ter o mesmo nome do arquivo java;


public class MinhaClasse {

    public static void main(String [] args) {

        System.out.print("Olá Classe, sejam bem vindos!\n");
        // declaração de strings sempre esta entre " "; 
        String primeiro$Nome = "Jair";
        String segundo_Nome = "Rocha";
        String terceiroNome = "Almeida"; 
        String nomeCompleto = nomeCompleto(primeiro$Nome, segundo_Nome, terceiroNome);
        
        System.out.println(nomeCompleto);
        
    }

// PADRÃO DE NOMENCLATURA:
// como já dito, todo arquivo java começa com a letra Maiuscula e o arquivo tem que ter o mesmo nome da classe;
// toda a variavel tem que ser escrita em minuscula;
// nas palavras compostas se usa a escrita camelCase;
// por boas praticas, não se inicia nome de variaveis ou metodos com numeros;
// não se utiliza simbolos especial, a não ser _ ou $;
// unica excessão é o uso de nome de variaveis toda em MAIUSCULA para determinar eu ela não deve sofrer alteração;
// para tanto se tem o uso da palavra reservada final para a criação da variavel, ex: final String PAIS = "Brasil";

// DECLARANDO VARIAVEIS E METODOS:
// -Variaveis:
// tipo nomeBemDefinido = atribuição(opcional), ex:
int idade = 21;
double altura = 1.72;
boolean verdadeiroFalso;
// Dog spike; 

// -Metodos:
//tipoDeRetorno nomeObjetivoNoInfinitivo parametro(s);
// todo metodo vc tera que espicificar o parametro(s) utilizados como no exemplo abaixo;
// todo metodo retorna um resultado;

int somar;
int somar(int numeroUm, int numero2){
    return somar;
}

String formatCep;

String formatCep(long cep){
    return formatCep;
}

    public static String nomeCompleto (String primeiro$Nome, String segundo_Nome, String terceiroNome){
        return "Resultado do metodo nome completo " + primeiro$Nome.concat(" ").concat(segundo_Nome).concat(" ").concat(terceiroNome);
    }
}
