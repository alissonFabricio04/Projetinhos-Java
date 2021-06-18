package desafio_aula07_poo;

public class Lutador {
    
//_____________________________________________________________________________________
//------------------------------------ATRIBUTOS--   --------------------------------------
//______________________________________________________________________________________
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas ;
    private int empates;

//_____________________________________________________________________________________
//------------------------------------CONSTRUCTOR--------------------------------------
//______________________________________________________________________________________
    
    public Lutador(String no, String na, int id, float pe, float al, int vi, int de, int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.setPeso(pe);
        this.altura = al;
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
        
    }
//_____________________________________________________________________________________
//------------------------------MEDOTOS ESPECIAIS--------------------------------------
//______________________________________________________________________________________
    
    public String getNome() {
        return nome;
    }

    public void setNome(String no) {
        this.nome = no;
    }
    
    public String getNacionalidade(){
        return nacionalidade;
    }
    
    public void setNacionalidade(String na){
        this.nacionalidade = na;
    }
    
    public int getIdade() {
        return idade;
    }
    
    public void setIdade(int id) {
        this.idade = id;
    }
    
    public float getAltura() {
        return altura;
    }
    
    public void setAltura(float al) {
        this.altura = al;
    }
    
    public float getPeso() {
        return peso;
    }
    
    public void setPeso(float pe) {
        this.peso = pe;
        this.setCategoria();
    }
    
    public String getCategoria() {
        return categoria;
    }
    
    private void setCategoria() {
        if(this.peso < 50) {
            
            this.categoria = "Invalido";
            
        } else if(this.peso <= 70) {
            
            this.categoria = "Leve";
            
        } else if(this.peso <= 80) {
            
            this.categoria = "Medio";
            
        } else if(this.peso <= 120) {
            
            this.categoria = "Pesado";
            
        } else {
            
            this.categoria = "Invalido";
            
        }
    }
    
    public int getVitorias() {
        return vitorias;
    }
    
    public void setVitorias(int vi) {
        this.vitorias = vi;
    }
    
    public int getDerrotas() {
        return derrotas;
    }
    
    public void setDerrotas(int de) {
        this.derrotas = de;
    }
    
    public int getEmpates() {
        return empates;
    }
    
    public void setEmpates(int em) {
        this.empates = em;
    }
//_____________________________________________________________________________________
//--------------------------------------MEDOTOS----------------------------------------
//_____________________________________________________________________________________
    
    public void apresentar() {
        System.out.println("CHEGOU A HORA! APRESENTANDO O LUTADOR " + this.getNome());
        System.out.println("Diretamente de " + this.getNacionalidade());
        System.out.print("Com " + this.getIdade() + " anos e ");
        System.out.println(this.getAltura() + "m de altura");
        System.out.println("Pesando " + this.getPeso() + "KG");
        System.out.println("Ganhou " + this.getVitorias());
        System.out.println("Perdeu " + this.getDerrotas());
        System.out.println("Empatou " + this.getEmpates());
    }
    
    public void status() {
        System.out.println(this.getNome());
        System.out.println("é um peso " + this.getCategoria());
        System.out.println(this.getVitorias() + " vitorias");
        System.out.println(this.getDerrotas() + " derrotas");
        System.out.println(this.getEmpates() + " empates");
    }
    
    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);
    }
    
    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
    }
    
    public void empateLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }
}

