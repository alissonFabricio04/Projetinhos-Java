package aula02.poo;

public class Aula02POO {

    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampar();
        c1.status();
        c1.rabisar();
        
        System.out.println("---------------------");
        Caneta c2 = new Caneta();
        c2.modelo = "Bic";
        c2.ponta = 0.8f;
        c2.cor = "Preta";
        c2.carga = 80;
        c2.destampar();
        c2.status();
        c2.rabisar();
    }
    
}
