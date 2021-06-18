package aula10.poo;

/**
 *
 * @author aliss
 */
public class Aula10POO {

    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        a1.setNome("Alisson");
        a1.setMatricula(800);
        a1.setCurso("Informatica");
        a1.setIdade(17);
        a1.setSexo("M");
        a1.fazerAniver();
        a1.PagarMensalidade();
        System.out.println(a1.toString());
        System.out.println(a1.getMatricula() + ", " + a1.getCurso());
        
        
        
        Bolsista b1 = new Bolsista();
        b1.setNome("Victor");        
        b1.setIdade(14);
        b1.setSexo("Gay");
        b1.setMatricula(80);
        b1.setBolsa(90.0f);
        b1.setCurso("Design");
        b1.PagarMensalidade();
        System.out.println(b1.toString());
        System.out.println(b1.getMatricula() + ", " + b1.getCurso() + ", " + b1.getBolsa());

        
        Tecnico t1 = new Tecnico();
        
        t1.Praticar();
        t1.setNome("Mew");
        t1.setIdade(5);
        t1.setSexo("M");
        t1.PagarMensalidade();
        
    }
    
}
