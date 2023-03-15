//IDENTAÇÃO: Faz parte das boas praticas da programação usar a identação, isto é,
// a tabulação do codigo de forma hierarquica para facilitar tanto a visualização como entendimento do codigo.
public class BoletimEstudantil {

    public static void main(String[] args) {
        
    int mediaFinal = 6;
    if(mediaFinal < 6){
    System.out.println("REPROVADO");
    }else if(mediaFinal == 6){
    System.out.println("PROVA MINERVA");
    }else{
    System.out.println("APROVADO");
    }

    }
    
}

/* podemos verificar com esse exemplo simples que a indentação facilita a leitura e entendimento do codigo.
    public static void main(String[] args) {
        
        int mediaFinal = 6;
        if(mediaFinal < 6){
            System.out.println("REPROVADO");
        }else if(mediaFinal == 6){
            System.out.println("PROVA MINERVA");
        }else{
            System.out.println("APROVADO");
        }
    }
*/