package aula02.poo;

public class Aula02POO {

    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        
        c1.modelo = "Bic";
        c1.cor = "Azul";
        //c1.ponta = 0.5f;
        c1.carga = 30;
        c1.destampar();
        c1.rabisar();
        c1.status();
    }
    
}
