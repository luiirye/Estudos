package clinica.dominio;

public class Escolaridade extends BaseComum {

    public Escolaridade(int codigo, String descricao) {
        super(codigo, descricao);
    }

    @Override
    public String toString() {
        String esc = "";

        esc += "------------------------ \n";

        esc += "BaseIdentificador [codigo=" + codigo + "] \n";

        esc += "BaseComum [descricao=" + descricao + " \n]";

        esc += "Escolaridade [] \n";

        esc += "------------------------ \n";
        
        return esc;
    }
}
