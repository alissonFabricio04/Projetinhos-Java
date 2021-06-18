package aula09.poo;

/**
 *
 * @author aliss
 */
public class Livro implements Publicaçao {
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    public String detalhes() {
    return "Livro{" + "titulo=" + titulo + "\n, autor=" + autor +
            "\n, totPaginas=" + totPaginas + "\n, pagAtual=" + pagAtual +
            "\n, aberto=" + aberto + "\n, leitor=" + leitor.getNome() +
            "\n, idade=" + leitor.getIdade() +
            "\n, sexo=" + leitor.getSexo() + '}';
    }    
    
    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setTotPaginas(totPaginas);
        this.setPagAtual(0);
        this.setAberto(false);
        this.setLeitor(leitor);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    
    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        if(this.getAberto() == true){
            this.setAberto(false);
            System.out.println("fechei o livro");
        } else {
            System.out.println("O livro ja esta fechado");
        }
    }

    @Override
    public void folhear(int pag) {
        if(pag > this.totPaginas) {
            this.pagAtual = 0;
        } else {
            this.setPagAtual(pag);
        }
        
    }

    @Override
    public void avançarPag() {
        this.setPagAtual(this.getPagAtual() + 1);
    }

    @Override
    public void voltarPag() {
        this.setPagAtual(this.getPagAtual() - 1);
    }  
    
}
