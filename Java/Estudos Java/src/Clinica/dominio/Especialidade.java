package clinica.dominio;

public class Especialidade extends BaseIdentificador {

    private String nomenclatura;

    public String getNomenclatura() {
        return nomenclatura;
    }

    public void setNomenclatura(String nomenclatura) {
        this.nomenclatura = nomenclatura;
    }

    public Especialidade(int codigo, String nomenclatura) {
        super(codigo);
        this.nomenclatura = nomenclatura;
    }

    @Override
    public String toString() {
        String esp = "";

        esp += "------------------------------------ \n";

        esp += "Especialidade [nomenclatura=" + nomenclatura + "] \n";

        esp += "BaseIdentificador [codigo=" + codigo + "] \n";
        
        return esp;
    }
}
