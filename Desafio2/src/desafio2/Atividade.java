package desafio2;

public class Atividade {
    String materia;
    String data;
    boolean entregue;
    
    
    void enviar() {
        if(this.data == "ontem" && this.entregue == false) {
            System.out.println("N é possivel entregar uma tarefa atrasada");
        } 
        
        else if(this.data == "amanhã" && this.entregue == false) {
            this.entregue = true;
            System.out.println("Entregue com sucesso");
        } 
        
        else if(this.data == "ontem" && this.entregue == true) {
            System.out.println("Vc ja entregou essa atividade");
        }
        
        else if(this.data == "amanhã" && this.entregue == true) {
            System.out.println("Parabens entregou adiantado");
        }
    }
    
    void cancelar() {
        if(this.entregue == true) {
            System.out.println("O envio foi cancelado");
        } 
        
        else if(this.entregue == false){
            System.out.println("A tarefa n foi entregue");
        }
    }
}
