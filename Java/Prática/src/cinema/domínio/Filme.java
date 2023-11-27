package cinema.domínio;

public class Filme extends BaseIdentificador {

    private String titulo, genero;
    private int duracao;
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public int getDuracao() {
        return duracao;
    }
    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
    public Filme(int codigo, String titulo, String genero, int duracao) {
        super(codigo);
        this.titulo = titulo;
        this.genero = genero;
        this.duracao = duracao;
    }
    
    @Override
    public String toString() {
        String film = "";
        
        film += "================================== \n";

        film += "BaseIdentificador [codigo=" + codigo + "] \n";

        film += "Filme [titulo=" + titulo + ", genero=" + genero + ", duracao=" + duracao + "] \n";

        film += "================================== \n";
        
        return film; 
    }

    
    
}
