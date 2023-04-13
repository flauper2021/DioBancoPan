package edu.mauricio.aulas.pOO.exercicio;

public class RodarApp {

    public static void main(String[] args) {
        
        Funcionario funcionario = new Funcionario();
        // aqui foi realizado um upCast.
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();
        // aqui foi realizado um downCast.
        //Gerente gerente2 = new Funcionario(); - aqui da erro de compilação
        //Vendedor vendedor2 = (Vendedor) new Funcionario(); - dá erro de compilação também aconselha evitar o downCast. 

    }
    
}
