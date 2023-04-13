package edu.mauricio.aulas.pOO.exemplo;

public class Veiculos {

    String cor;
    String modelo;
    String tipo;
    int capacidadeTanque;

    
    public Veiculos(){

    }

    public Veiculos(String cor, String modelo, int capacidadeTanque){

        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;

    }

    void setCor(String cor) {
        this.cor = cor;
    }
    String getCor() {
        return cor;
    }

    void setModelo(String modelo) {
        this.modelo = modelo;
    }
    String getModelo() {
        return modelo;
    }

    void setCapacidadeTanque(int capacidadeTanque){
        this.capacidadeTanque = capacidadeTanque;
    }
    int getCapacidadeTanque(){
        return capacidadeTanque;
    }

    public double abastecer(double valorCombustivel){
        return capacidadeTanque * valorCombustivel;
    }

    public double abastecer(int combustivel, double valorCombustivel){

        return combustivel * valorCombustivel;

    }
    
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        
        return "Capacidade do tanque: " + this.capacidadeTanque + ", modelo: " + this.modelo +
        ", cor: " + this.cor + ", tipo: "+ this.tipo;
    }
}
