package desafio_aula07_poo;

import java.util.Random;


public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovado;
    
    public void marcarLuta(Lutador l1, Lutador l2) {
        if(l1.getCategoria() == l2.getCategoria() && l1 != l2) {
            this.aprovado = true;
            this.desafiado = l1;
            this.desafiante = l2;
        } else {
            this.aprovado = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }
    
    public void lutar() {
        if (this.aprovado == true) {
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar();
            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentar();
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            System.out.println("=======Resultado========");
            switch(vencedor) {
                case 0: //empate
                        System.out.println("Empatou!");
                        this.desafiado.empateLuta();
                        this.desafiante.empateLuta();
                    break;
                
                case 1: //desafiado Ganhou 
                        System.out.println("O vendedor é " + this.desafiado.getNome());
                        this.desafiado.ganharLuta();
                        this.desafiante.perderLuta();
                    break;
                    
                case 2: //desafiante Ganhou 
                        System.out.println("O vencedor é " + this.desafiante.getNome());
                        this.desafiante.ganharLuta();
                        this.desafiado.perderLuta();
                    break;
            }
            System.out.println("========================");
        } else {
            System.out.println("Luta não pode acontecer");
            this.aprovado = false;
        }
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }

}
