package desafio_aula05_poo;

import java.util.Scanner;

public class Desafio_Aula05_POO {

    public static void main(String[] args) {
        System.out.print("Digite seu nome: ");
        Scanner entrada = new Scanner(System.in);
        String nome = entrada.nextLine();
        Conta conta1 = new Conta(nome , 0, false);
        

        conta1.abrirConta();
    }
}
