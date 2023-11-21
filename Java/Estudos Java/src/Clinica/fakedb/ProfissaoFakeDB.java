package clinica.fakedb;

import clinica.dominio.Profissao;

public class ProfissaoFakeDB extends BaseGenericaFakeDB<Profissao> {

    //construtor primeiro

    public ProfissaoFakeDB(){
        super();
    }

    //Carregar Dados 

    public void CarregarDados(){
        this.tabela.add(new Profissao(1, "Médico Geral"));
        this.tabela.add(new Profissao(2, "Meretriz"));
        this.tabela.add(new Profissao(3, "Engenheiro"));
        this.tabela.add(new Profissao(4, "Programador"));
        this.tabela.add(new Profissao(5, "Contador"));
    }
}
