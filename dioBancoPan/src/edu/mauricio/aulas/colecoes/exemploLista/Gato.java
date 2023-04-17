package edu.mauricio.aulas.colecoes.exemploLista;

class Gato implements Comparable<Gato>{

    private String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome, Integer idade, String cor){
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade(){
        return idade;
    }
    public void setIdade(Integer idade){
        this.idade = idade;
    }

    public String getCor(){
        return cor;
    }
    public void setCor(String cor){
        this.cor = cor;
    }

    @Override
    public String toString(){

        return "{Nome: " + nome + 
        ", idade: "+ idade +
        ", cor: "+ cor + "}"; 
        
    }
    // o metodo compareTo sempre vai retornar um int, pois ele trabalha comparando elementos e estupalndo os
    // valores: '1, 0, -1', sendo que '1' represente que ele é maior, '0' representa que é igual e '-1'
    // representa que ele é menor, ordenando a lista.
    // no caso de String, se usa o 'compareToIngnoreCase' para transfoma-lo em int e compara-lo 
    @Override
    public int compareTo(Gato gato){
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }

}
