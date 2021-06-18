package desafio1;

public class Computador {
    String marca;
    boolean ligado;
    
    void Ligar() {
        this.ligado = true;
    }
    
    void Desligar() {
        this.ligado = false;
    }
    
    void Mexer() {
        if(this.ligado == false) {
            System.out.println("N consigo mexer, deve estar desligado");
        } else {
            System.out.println("Mexendo");
        }
    }
}
