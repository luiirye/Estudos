package cinema.domínio;

public class Ator extends BaseIdentificador {

    private String nome, papelDoAtor;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPapelDoAtor() {
        return papelDoAtor;
    }

    public void setPapelDoAtor(String papelDoAtor) {
        this.papelDoAtor = papelDoAtor;
    }

    public Ator(int codigo, String nome, String papelDoAtor) {
        super(codigo);
        this.nome = nome;
        this.papelDoAtor = papelDoAtor;
    }

    
    
}
