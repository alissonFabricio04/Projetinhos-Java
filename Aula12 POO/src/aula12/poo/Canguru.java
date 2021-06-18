
package aula12.poo;

/**
 *
 * @author aliss
 */
public class Canguru extends Mamifero {
    
    public void usarBolsa() {
        System.out.println("Canguru bb entrou na bolsa");
    }
    
    @Override
    public void locomover() {
        System.out.println("Pulando");
    }
}
