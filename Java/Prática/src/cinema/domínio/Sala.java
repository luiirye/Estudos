package cinema.domínio;

public class Sala extends BaseIdentificador {

    private int numAssentos;
    private String tipoTela, localizacao;
    
    public int getNumAssentos() {
        return numAssentos;
    }
    public void setNumAssentos(int numAssentos) {
        this.numAssentos = numAssentos;
    }
    public String getTipoTela() {
        return tipoTela;
    }
    public void setTipoTela(String tipoTela) {
        this.tipoTela = tipoTela;
    }
    public String getLocalizacao() {
        return localizacao;
    }
    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
    public Sala(int codigo, int numAssentos, String tipoTela, String localizacao) {
        super(codigo);
        this.numAssentos = numAssentos;
        this.tipoTela = tipoTela;
        this.localizacao = localizacao;
    }
    @Override
    public String toString() {
        String sala = "";

        sala += "==================================== \n";

        sala += "BaseIdentificador [codigo=" + codigo + "] \n";
        
        sala += "Sala [numAssentos=" + numAssentos + ", tipoTela=" + tipoTela + ", localizacao=" + localizacao + "] \n";

        sala += "==================================== \n";
    
        return sala;
    }
}
