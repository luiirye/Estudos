package clinica.dominio;

public class Profissao extends BaseComum {

    public Profissao(int codigo, String descricao) {
        super(codigo, descricao);
    }
    
    @Override
    public String toString() {
        String p = "";

        p += "============================================ \n";

        p += "BaseComum [descricao=" + descricao + "] \n";

        p += "BaseIdentificador [codigo=" + codigo + "] \n";
        
        p += "============================================ \n";

        return p;
    }    
}
