package clinica.dominio;

public class RegistroCRM extends BaseIdentificador {

    private String numero;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public RegistroCRM(int codigo, String numero) {
        super(codigo);
        this.numero = numero;
    }

    @Override
    public String toString() {
        String reg = "";

        reg += "==================================================== \n";

        reg += "RegistroCRM [numero=" + numero + "] \n";

        reg += "BaseIdentificador [codigo=" + codigo + "] \n";

        reg += "==================================================== \n";
        
        return reg; 
    }

}
