package cinema.domínio;

public class FilmesPorAtor extends BaseIdentificador {

    private int codigoAtor, codigoFilme;

    public int getCodigoAtor() {
        return codigoAtor;
    }

    public void setCodigoAtor(int codigoAtor) {
        this.codigoAtor = codigoAtor;
    }

    public int getCodigoFilme() {
        return codigoFilme;
    }

    public void setCodigoFilme(int codigoFilme) {
        this.codigoFilme = codigoFilme;
    }

    public FilmesPorAtor(int codigo, int codigoAtor, int codigoFilme) {
        super(codigo);
        this.codigoAtor = codigoAtor;
        this.codigoFilme = codigoFilme;
    }

    @Override
    public String toString() {
        String fpa = "";

        fpa += "===================================== \n";

        fpa += "BaseIdentificador [codigo=" + codigo + "] \n";

        fpa += "FilmesPorAtor [codigoAtor=" + codigoAtor + ", codigoFilme=" + codigoFilme + "] \n";

        fpa += "===================================== \n";
        
        return fpa;
    }

    
    
}
