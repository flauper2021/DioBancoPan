package atividadeExemplo;

public class SmartTv {

    boolean ligarTv = false;
    int volume = 10;
    int canal = 1;

    public void ligar(){
        ligarTv = true;
        System.out.println("\nA televisão está ligada ? " + ligarTv);
    }

    public void desligar(){
        ligarTv = false;
        System.out.println("\nA televisão está ligada ? " + ligarTv);
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("\nO volume foi aumentado para: " +volume);
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("\nO volume foi decrementado para: " + volume);
    }

    public void aumentarCanal(){
        canal++;
        System.out.println("\nO canal foi aumentado para: " + canal);
    }

    public void diminuirCanal(){
        canal--;
        System.out.println("\nO canal foi diminuido para: " + canal);
    }

    public void mudarCanal(int mudarCanal){
        canal = mudarCanal;
        System.out.println("\nO canal foi mudado para: " + canal);

    }

    
}
