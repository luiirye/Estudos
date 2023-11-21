package clinica.dominio;

public abstract class BaseComum extends BaseIdentificador {

    protected String descricao;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BaseComum(int codigo, String descricao) {
        super(codigo);
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "BaseComum [descricao=" + descricao + "]";
    }

}
