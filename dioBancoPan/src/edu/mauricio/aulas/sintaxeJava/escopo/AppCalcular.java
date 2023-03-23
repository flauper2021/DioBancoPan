package edu.mauricio.aulas.sintaxeJava.escopo;

public class AppCalcular {

    public static void main(String[] args) {
        
        Saldo saldoContaCorrente = new Saldo();

        saldoContaCorrente.calcularPrestacao(50, 5);
        System.out.println("\n" + saldoContaCorrente.valorEmprestimo);

        System.out.println("\n" + saldoContaCorrente.saldo);

        saldoContaCorrente.sacar(30);

        saldoContaCorrente.imprimirSaldo();

        saldoContaCorrente.depositar(50);

        saldoContaCorrente.imprimirSaldo();
    
        System.out.println("\n" + saldoContaCorrente.calcularDividaExpoencial());

    }
    
}
