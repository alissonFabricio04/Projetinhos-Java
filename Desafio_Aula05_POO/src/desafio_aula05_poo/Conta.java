package desafio_aula05_poo;

import java.util.Scanner;

public class Conta {
    public long numConta;
    protected String tipo;
    private String dono;
    private int saldo;
    private boolean status;

    public Conta(String dono, int saldo, boolean status) {
        this.saldo = saldo;
        this.status = status;
        this.dono = dono;
    } 
    
    public long getNumConta() {
       return numConta;
    }

    public void setNumConta(long numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    
    public void abrirConta(){
        if(status == false) {
            System.out.print("Qual tipo de conta você quer abrir? cc(Conta Corrente) ou cp(Conta Poupança)? ");
            Scanner entrada = new Scanner(System.in);
            String tipo = entrada.nextLine();
            if(tipo.equals("cc") || tipo.equals("Cc") || tipo.equals("CC")) {
               this.tipo = "cc";
               this.saldo = 50;
               this.status = true;
               System.out.println("Conta Corrente foi aberta com sucesso! Seja bem vindo " + dono);  
               pagarMensal();
            } else if (tipo.equals("cp") || tipo.equals("Cp") || tipo.equals("CP")) {
                this.tipo = "cp";
                this.saldo = 150;
                this.status = true;
                System.out.println("Conta Poupança foi aberta com sucesso! Seja bem vindo " + dono);
                pagarMensal();
            } else {
                System.out.println("Tipo de conta invalida");
            }
        } else {
            System.out.println("Você ja possui uma conta aberta");
        }
    }
    
    public boolean fecharConta(){
        if(status == true) {
            if(saldo > 0){
                System.out.println("Não podemos fechar a conta, ainda possui saldo");
            } else if(saldo < 0) {
                System.out.println("Não podemos fechar conta, esta em debito");
            } else {
                System.out.println("Sua conta foi fechada com sucesso!");
                this.status = false; 
            }
        } else {
            System.out.println("Você não possui uma conta neste banco");
        }
        return status;
    }
    
    public int depositar(){
        if (status == true) {
            System.out.println("Digite o valor que quer depositar");
            Scanner entrada = new Scanner(System.in);
            int deposito = entrada.nextInt();
            saldo = saldo + deposito;
            System.out.println("Deposito concluido, seu saldo atual é " + saldo);
        } else {
            System.out.println("Deposito não pode ser concluido");
        }
        return saldo;   
    }
    
    public int sacar(){
        if (status == true) {
            System.out.print("Digite o valor que quer sacar: ");
            Scanner entrada = new Scanner(System.in);
            int saque = entrada.nextInt();
            if (saque > saldo) {
                System.out.println("Não podemos autorizar o saque");
            } else if (saque <= saldo) {
                saldo = saldo - saque;
                System.out.println("O valor foi sacado com sucesso");
            }
        } else {
            System.out.println("Você nao possui uma conta neste banco");
        }
        
        return saldo;
    }
    
    public int pagarMensal() {

        if(tipo.equals("cc") || tipo.equals("Cc") || tipo.equals("CC")){
            saldo = saldo - 12;
            System.out.println("O valor da mensalide ja foi descontado");
            System.out.println("Seu saldo atual é " + saldo);
            
        } else if(tipo.equals("cp") || tipo.equals("Cp") || tipo.equals("CP")){
            
            saldo = saldo - 20;
            System.out.println("O valor da mensalide ja foi descontado");
            System.out.println("Seu saldo atual é " + saldo);

        } else if(saldo < saldo + 10) {
            System.out.println("Impossivel descontar mensalidade");
        }
        
        return saldo;
    }   
}
