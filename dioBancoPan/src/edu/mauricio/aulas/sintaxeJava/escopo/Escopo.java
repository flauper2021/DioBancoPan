package edu.mauricio.aulas.sintaxeJava.escopo;

public class Escopo {

    /*
    Escopo é o ambiente onde a variavel pode ser acessada, isto é, refere-se a vida e acessibilidade de 
    uma variavel, pode-se dividir em:

    -Escopo de Classe: refere-se as variáveis que podem ser acessadas em toda a classe criada, 
    geralmente é criada no inicio da classe.

    -Escopo de Metodo: são variáveis criadas dentro de um metodo, e apensas são acessiveis dentro das mesmas.

    - Escopo de fluxo: são as variáveis criadas dentro de um bloco de função, não sendo acessiceis em 
    nenhum momento.
    */

    //variavel da classe Escopo

    double saldo = 10.0;

    public void sacar(double valor){
        // "valor" - varialve local do metodo
        double novoSaldo = saldo - valor;
        saldo = novoSaldo;        
    }

    public void depositar(double valor){
        double novoSaldo = saldo + valor;
        saldo = novoSaldo;
    }

    public void imprimirSaldo(){
        //"saldo" - disponivel em toda a classe.
        System.out.println("\nSeu saldo: " + saldo);
        //somente no metodo sacar conhece essa variavel - "novoSaldo", aqui ela dará erro.
        //System.out.println(novoSaldo);
    }

    /*public double CalcularPrestacoes(double valorParcela, int parcela){ //não consegui descobrir porque 
        não aceita criar esse metodo em double?

        //variavel local metodo
        
        double valorMontante = 0.0;

        for(int x = 1; x <= parcela; x++){
            // "x" é uma variável de fluxo, ela sera reiniciada a cada execução do metodo.
            float valorCalculado = valorParcela * x;
            valorMontante = valorMontante + valorCalculado;
            //"X e valorMontante" nunca estarão disponiveis
            return valorMontante;
        }

    }*/
    
}
