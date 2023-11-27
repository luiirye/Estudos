package cinema.domínio;

public class Ingresso extends BaseIdentificador {

    private String tipo, categoria;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Ingresso(int codigo, String tipo, String categoria) {
        super(codigo);
        this.tipo = tipo;
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        String ing = "";

        ing += "========================== \n";

        ing += "BaseIdentificador [codigo=" + codigo + "] \n";

        ing += "Ingresso [tipo=" + tipo + ", categoria=" + categoria + "] \n";
        
        ing += "========================== \n";
        
        return ing; 
    }
}
