import javax.print.event.PrintJobListener;

public class SmartTv{
    boolean ligada = false;
    int canal = 1;
    int volume = 25;
    
  
    public void ligar() {
        ligada=true;
    }

    public void desligar(){
        ligada=false;
    }

    public void aumentarVolume() {
        //volume = volume + 1;
        volume++;        
        System.out.println("Aumentou o volume para: ");
    }

    public void diminuirVolume() {
       // volume = volume - 1;
        volume--;   
        System.out.println("Diminuiu o volume para: ");
    }

    public void mudarCanal(){
        canal++;
        System.out.println("Mudar para o canal: ");
    }
}