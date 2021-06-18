
package aula10.poo;

public class Bolsista extends Aluno {
    private float bolsa;
    
    public void RenovarBolsa() {
        System.out.println("Renovando bolsa de " + this.getNome());
    }
    
    @Override
    public void PagarMensalidade() {
        System.out.println("Vc é bolsista, pagamento de " + this.getNome() + " facilitado");
    }
    
    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
}
