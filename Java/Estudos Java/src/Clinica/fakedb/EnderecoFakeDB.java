package clinica.fakedb;

import clinica.dominio.Endereco;

public class EnderecoFakeDB extends BaseGenericaFakeDB<Endereco> {

    public EnderecoFakeDB(){
        super();
    }

    @Override
    public void CarregarDados() {
        this.tabela.add(new Endereco(1, "rua", "Não", 10, 9999999, 100));
        this.tabela.add(new Endereco(2, "rua", "Não", 20, 9999999, 200));
        this.tabela.add(new Endereco(3, "rua", "Não", 30, 9999999, 300));
        this.tabela.add(new Endereco(4, "rua", "Não", 40, 9999999, 400));
        this.tabela.add(new Endereco(5, "rua", "Não", 50, 9999999, 500));

    }
}
