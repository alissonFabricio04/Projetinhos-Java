package aula09.poo;

/**
 *
 * @author aliss
 */
public class Aula09POO {

    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[2];
        
        p[0] = new Pessoa("Alisson", 17, "M");
        p[1] = new Pessoa("Maria", 51, "F");
        
        l[0] = new Livro("One Piece", "Eichiro Oda", 22, p[0]);
        l[1] = new Livro("One punch man", "One", 40, p[1]);
        
        l[0].abrir();
        l[0].folhear(12);
        System.out.println(l[0].detalhes());
    }
    
}
