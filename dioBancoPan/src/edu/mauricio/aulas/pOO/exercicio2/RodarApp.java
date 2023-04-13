package edu.mauricio.aulas.pOO.exercicio2;

public class RodarApp {

    public static void main(String[] args) {
        
        ClasseMae[] classes = new ClasseMae[]{new ClasseFilha01(), new ClasseFilha02(), new ClasseMae()};

        for (ClasseMae classe: classes){
            classe.metodo01();
        }

        System.out.println(" ");

        for (ClasseMae classe: classes){
            classe.metodo02();

        }

        System.out.println(" ");

        ClasseFilha02 classeFilha02 = new ClasseFilha02();
        classeFilha02.metodo02();

    }
    
}
