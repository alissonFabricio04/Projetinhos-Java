
package aula12.poo;

/**
 *
 * @author aliss
 */
public class Peixe extends Animal {
    private String corEscama;

    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo substancias");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe n faz som");
    }
    
    public void SoltarBolha() {
        System.out.println("Soltando Bolhas");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
}
