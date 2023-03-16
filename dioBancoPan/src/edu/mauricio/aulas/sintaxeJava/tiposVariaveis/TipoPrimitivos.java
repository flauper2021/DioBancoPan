package edu.mauricio.aulas.sintaxeJava.tiposVariaveis;

public class TipoPrimitivos {
    /* Tipos de dados básicos que são usados para a construção dos programas, 
    são alocados diretamente na pilha de memoria e seus valores são manipulaveis;
    
    São tipos primitivos inteiros:

    TIPO                MEMORIA                 VALOR MINIMO                    VAVLOR MAXIMO

    byte                1 byte                  -128                            127
    short               2 bytes                 -32768                          32767
    int                 4 bytes                 -2147483648                     2147483647
    long                8 bytes                 -9223372036854775808            9223372036854775807
    
    curiosidade: o 0(zero) e contado como número positivo.
    
    São tipos primitivos fracionários:

    float               4 bytes                 -3.4028E +38                    3.4028E +38
    double              8 bytes                 -1.7976E +308                   1.7976E +308

    com o advento de computadores cada vez mais potentes, se esta tornando desnecessário o uso dos tipos 
    variaveis short e byte, utilizando comumente mais o int e o double para as aplicações;

    ESTRUTURA:

    <tipo> <nomeVariavel> <atribuição do valor(opcional)>

    todo tipo de variavel tem por padrão 0(zero);
    no caso da variável tipo "boolean" tem por padrão "false";
    
    exemplos:
     */

    public static void main(String [] args){
        
        int idade;
        int anoFabricação = 2021;
        double salarioMinimo = 2500.00; // lembre que por convenção, o ponto marca a fração.
        boolean VerdadeiroFalso;
        String palavra;
        
    }

    /*
    PECULIARIDADES:
        
        geralmente se é utilizados os dados como o exemplo abaixo:

            byte idade = 123;
            short ano = 2021;
            int cep = 21070333;
            long cpf = 98765432109L;
            float pi = 3.14F;
            double salario = 1275.33;
        
        -o long e o float e sempre terminado com a primeira letra da variavel, idependente de ser 
        maiuscula ou minuscula;
        - cuidado ao uso de variaveis com numeros começados por 0(zero), já que o Java não reconhece
        o mesmo quando ele é o primeiro numero, geralmente se usa o numero no formato String.

        -curiosidade: como o Java é uma linguagem de programação fortemente tipada, ela não permite
        que tipos de variaveis menores redeba valores de tipos de variaveis maiores devendo ser manipulados
        pelo programador para realiza essa modificação, ex:

            short numeroCurto1 = 1;
            int numeroNormal = numero curto; // aqui uma variavel de tipo maior recebe o valor normalmente;
            short numeroCurto2 = numeroNormal; // aqui o Java não permite a variavel de tipo menor receber o
            valor da variavel de tipo maior.
                
        - para esse tipo variavel receber o valor de uma variavel de tipo superior, o programador
        tera que manipular esse dado realizando um cast(é uma conversão, é quando convertemos um
        valor de um tipo para outro tipo).exemplo: */

    short numeroCurto1 = 1;
    int numeroNormal = numeroCurto1;
    short numeroCurto2 = (short) numeroNormal;

    /*
    CONSTANTES: é quando o programador estipula que o valor da variável criada não sofrerá alterações,
    seus valores serão permanentes utilizando a palavra reservada "final".
    -por convenção o programador identificará essa variável com escrita em CAIXA ALTA.
    exemplo: */

    final double VALORPI = 3.14;
    

}
