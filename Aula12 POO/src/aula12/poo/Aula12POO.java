package aula12.poo;

/**
 *
 * @author aliss
 */
public class Aula12POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Mamifero m1 = new Mamifero();
        Reptil r1 = new Reptil();
        Peixe p1 = new Peixe();
        Ave v1 = new Ave();
        
        m1.setCorPelo("Preto");
        r1.setCorEscama("Vermelho");
        p1.setCorEscama("Laranja");
        v1.setCorPena("Azul");
        
        m1.locomover();
        r1.locomover();
        p1.locomover();
        v1.locomover();
        
        
    }
    
}
