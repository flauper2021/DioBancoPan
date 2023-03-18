package edu.mauricio.aulas.sintaxeJava.operadores;

public class IncrementaDecrementa{

    public static void main(String[] args) {
        
        int numero = 5;
        // para incrementar o valor da variave numero podemos fazer da seguinte forma:
        // numero = numero +1;
        // outra forma de fazer e usando o sinal de operração ' ++ ';
        // numero ++; como no exemplos abaixo:

        System.out.println(numero+1);// resposta 6, mas aqui ele faz uma operação matematica e não incremento;

        System.out.println(numero); // resposta 5, pois a variavel não sofreu modificação de seu valor;

        System.out.println(numero++);// respota 5, pois o incremento foi realizado após a impressão;

        System.out.println(numero);// resposta 6, o valor da variavel foi alterado;

        System.out.println(++numero);// resposta 7, o valor é alterado antes da impressão;

        System.out.println(numero);// resposta 7;

        System.out.println(1+numero);// resposta 8, pois é feita a soma do numero 1 com a variavel;

        System.out.println(numero);// resposta 7.


        // uso do operador ' ! ' para alterar o valor da variavel logica boolean:

        boolean variavel = true;

        System.out.println(!variavel); // no uso do operador de negação nesses casos, ira alterar
        // temporavelmente o valor da variavel.

        System.out.println(variavel);

        //a forma de inverter esse valor é somente atraves da atribuição:

        variavel = !variavel;

        System.out.println(variavel);


    }

}
