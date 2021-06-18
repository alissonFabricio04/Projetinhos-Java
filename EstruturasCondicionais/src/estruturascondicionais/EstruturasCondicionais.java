package estruturascondicionais;

import java.util.Scanner;

/**
 *
 * @author alisson
 */
public class EstruturasCondicionais {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        /*
        System.out.print("Em que ano voce nasceu? ");
        int nasc = entrada.nextInt();
        int i = 2021 - nasc;
        System.out.print("A Sua idade é " + i + ", ");
        if (i >= 18){
            System.out.println("Você é maior de idade");
        } else {
            System.out.println("Você é menor de idade");
        }
        */
        //numero de pernas de um animal
        System.out.print("Quantas pernas? ");
        int perna = entrada.nextInt();
        String tipo;
        System.out.print("Isso é um(a) ");
        switch (perna) {
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bípede";
                break;
            case 3:
                tipo = "Trípe";
                break;
            case 4:
                tipo = "Quadrúpede";
                break;
            case 6: case 8:
                tipo = "Aranha";
                break;
            default:
                tipo = "ET";
                break;
        }
        System.out.println(tipo);
    }
    
}
