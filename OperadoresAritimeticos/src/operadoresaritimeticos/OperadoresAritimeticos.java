/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoresaritimeticos;

import java.util.Scanner;

/**
 *
 * @author aliss
 */
public class OperadoresAritimeticos {

    /**import java.util.Scanner;
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*int n1 = 3;
        int n2 = 5;
        float media = (n1 + n2)/2f;
        System.out.println("A sua media ficou em: " + media);
        */
        
        /*int num = 10;
        int valor = 19 + num++;
        System.out.println(valor);
        System.out.println(num);
        */
        
        /*int x = 4;
        x *= 3; //x = x + 2
        System.out.println(x);
        */
        
        /*float v = 8.5f;
        int bar = (int) Math.round(v);
        System.out.println(bar);
        */
        
        /*double ale = Math.random();
        int n = (int) (0 + ale * (10-0));
        System.out.println(n);
        */
        
        /*
        int n1 = 5;
        int n2 = 2;
        
        int maior = n1 > n2 ? n1 : n2;
        
        System.out.println(maior);
        */
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite um valor para o escolpo 1: ");
        String n1 = entrada.nextLine();
        
        int N1 = Integer.parseInt(n1);
        
        System.out.print("Digite um valor para o escolpo 2: ");
        String n2 = entrada.nextLine();
        
        int N2 = Integer.parseInt(n2);
        
        int Maior = N1 > N2 ? N1 : N2;
        
        System.out.println("O maior valor que você digitou é " + Maior);
        
    }
    
}
