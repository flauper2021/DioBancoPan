package edu.mauricio.aulas.sintaxeJava.operadores;

public class OperadoresAritimeticos{

    /* Operadores:

    Podem ser definidos como simbolos especiais que tem significado próprio para a linguagem, 
    estando associados a determinadas funções lógicas.

    São alguns deles:

    ' == ' significa igualdade;
    ' != ' significa diferente;
    ' < ' significa menor que;
    ' > ' significa maior que;
    ' <= ' significa menor ou igual;
    ' >= ' significa maior ou igual;

    */

    /* Operadores de atribuição:

    o operador de atribuição e representado pelo sinal de ' = ', serve para agregar um valor a uma
    variavel ou modifica-lo posteriormente;
        ex:
        String nome = "RODOLFO"; // aqui se está agregando o nome "RODOLFO" na variável do tipo
    string "nome";

        nome = "AMADEUS"; // aqui se modificou o valor da variável "nome" atribuindo a ele o novo valor
    "AMADEUS";

    */

    /* Operadores aritiméticos:
    
    são operadores para realizar operações matematicas, são eles:

        ' + ' a adição ;
        ' - ' a subtração;
        ' * ' a multiplicação;
        ' / ' a divisão;
        ' % ' e o modulo.

    observação: o sinal de ' + ' quando se utiliza string faz a concatenação dos valores e não a soma.
    exemplos:    
     */

    public static void main(String[] args) {
        
        String concatenacao = "Linguagem" + "Geek";
        System.out.println(concatenacao);

        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);
        // apos a ide ler a string ele passa a identificar todas os numeros como strings, a não ser no
        // ultimo caso em que o '()' altera a ordem de iniciativa, somando primeiro os numeros e depois
        //concatenando a string.

    }

}