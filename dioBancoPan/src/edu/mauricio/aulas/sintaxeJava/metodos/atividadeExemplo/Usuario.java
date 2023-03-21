package atividadeExemplo;

public class Usuario {
    public static void main(String[] args) {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("\nA televisão esta ligada? " + smartTv.ligarTv);
        System.out.println("Qual o volume da televisão? " + smartTv.volume);
        System.out.println("Em qual canal esta? " + smartTv.canal + "\n");

        smartTv.ligar();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarCanal();
        smartTv.diminuirVolume();
        smartTv.aumentarCanal();
        smartTv.diminuirCanal();
        smartTv.mudarCanal(10);
        smartTv.desligar();

    }
    
}
