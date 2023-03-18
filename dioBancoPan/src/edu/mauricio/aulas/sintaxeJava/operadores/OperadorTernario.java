package edu.mauricio.aulas.sintaxeJava.operadores;

public class OperadorTernario {

    public static void main(String[] args) {
        
        int a = 5, b = 6;
        String resultado = "";

        if(a==b){
            resultado = "verdadeiro";
        }else{
            resultado = "falso";
        }

        System.out.println(resultado);

        // no caso acima, verificamos que foi feita um teste para saber se a igualdade da variavel a e b
        // é verdadeira ou falso. No caso de uma verificação de condição boleana pode se usar o operador
        // ternario para resolver a condição:

        String resposta = a==b ? "verdadeiro" : "falso";
        System.out.println(resposta);
        
        resposta = a==(b-1) ? "verdadeiro" : "falso";
        System.out.println(resposta);

        int verificação = a==b ? 0 : 1;
        System.out.println(verificação);
        //lembrando que o operador ternario primeiro retorna se a condição primairia é verdade, senão 
        // retorna falso;
    }
    
}
