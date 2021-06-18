
package aula10.poo;

public class Tecnico extends Aluno {
    private int registroProfissional;

    
    public void Praticar() {
        System.out.println("Praticando!!!");
        System.out.println(this.getRegistroProfissional());
    }
    
    
//______________________________________________________________________________ 
//______________________________________________________________________________
    
    public int getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
}
