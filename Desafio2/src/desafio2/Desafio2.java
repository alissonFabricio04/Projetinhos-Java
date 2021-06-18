package desafio2;

public class Desafio2 {

    public static void main(String[] args) {
        System.out.println("Tarefa1");
        Atividade tarefa1 = new Atividade();
            
            tarefa1.materia = "Geografia";
            tarefa1.data = "ontem";
            tarefa1.entregue = true;
            
            tarefa1.enviar();
            
            
        Atividade tarefa2 = new Atividade();
            System.out.println("Tarefa 2");
            tarefa2.materia = "Linguagem de Programação";
            tarefa2.data = "amanhã";
            tarefa2.entregue = false;
            
            tarefa2.cancelar();
            
    }
    
}
