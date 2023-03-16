package edu.mauricio.aulas.sintaxeJava.operadores;

public class OperadoresUnarios {
    
    /* sao operadores que são aplicados com os outros operadores aritimeticos:

        - ( + )  Operador unário de valor positivo;
        - ( - )  Operador unário de valor negativo;
        - ( ++ ) Operador unário de incremento;
        - ( -- ) Operador unário de decremento;
        - ( ! )  Operador unário de negação;
    
    */

    public static void main(String[] args) {
        //exemplo:

        int numero = 5;
        System.out.println(numero);

        numero = -numero;
        System.out.println(numero);

        numero = +numero;
        System.out.println(numero);
        // nota-se que não tem como reverter de negativo para positivo devendo aplicar multiplicação por -1
        // para tornar o numero positivo.

        numero = numero * -1;
        System.out.println(numero);

    }

}
