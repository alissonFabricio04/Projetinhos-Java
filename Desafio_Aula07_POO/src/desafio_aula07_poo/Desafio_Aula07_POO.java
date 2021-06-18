package desafio_aula07_poo;

public class Desafio_Aula07_POO {

    public static void main(String[] args) {
        
        Lutador l[] = new Lutador [6];

        l[0] = new Lutador("Pretty Boy", "Franca", 18, 81.9f, 1.60f, 1, 2, 3);
        l[1] = new Lutador("Putscript", "Brasil", 31, 61.6f, 1.80f, 2, 4, 2);
        l[2] = new Lutador("SnapShadow", "EUA",35, 76.9f, 1.70f, 12, 2, 1);
        l[3] = new Lutador("Dead Code", "Austrália",28, 86.8f, 1.77f, 13, 0, 2);
        l[4] = new Lutador("UfoCobol","Brasil", 37, 119.3f, 1.83f, 5, 4, 3);
        l[5] = new Lutador("Nerdart","EUA", 30, 105.7f, 1.91f, 12, 2, 4);
        
        Luta UEC01 = new Luta();
        UEC01.marcarLuta(l[1], l[4]);
        UEC01.lutar();
        l[1].status();
        l[4].status();
    }
    
}
