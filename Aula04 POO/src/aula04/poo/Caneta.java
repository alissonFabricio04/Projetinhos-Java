
package aula04.poo;

public class Caneta {
    private String modelo;
    private float ponta;
    private String cor;
    private boolean tampar;
    
    public Caneta(String m, String c, float p) { //Metodo constructor
        this.modelo = m;
        this.cor = c;
        this.ponta = p;
        this.tampar();
       
    }
    
    public String getModelo() {
        return this.modelo;
    }
    
    public void setModelo(String m) {
        this.modelo = m;
    }
    
    public float getPonta() {
        return this.ponta;
    }
    
    public void setponta(float p) {
        this.ponta = p;
    }
    
    public void tampar() {
       this.tampar = true;
    }
    
    public void destampar() {
        this.tampar = false;
    }
    
    public void status() {
        System.out.println("Sobre a Caneta: ");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada? " + this.tampar);
    }
}
