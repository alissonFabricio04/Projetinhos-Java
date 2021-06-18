package desafio1;

public class Desafio1 {

    public static void main(String[] args) {
        
        
        Computador pc1 = new Computador();
            
            pc1.marca = "Lenovo";
            pc1.ligado = true;
            
            pc1.Mexer();
            
        System.out.println("A marca desse PC é " + pc1.marca);    
        
        System.out.println("-----------------------------------");
        
        Computador pc2 = new Computador();
            
            pc2.marca = "Positivo";
            pc2.ligado = false;
            
            pc2.Mexer();
            
        System.out.println("A marca desse PC é " + pc2.marca); 
    }
    
}
