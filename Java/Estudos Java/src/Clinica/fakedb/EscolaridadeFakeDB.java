package clinica.fakedb;

import clinica.dominio.Escolaridade;

public class EscolaridadeFakeDB extends BaseGenericaFakeDB<Escolaridade> {

    public EscolaridadeFakeDB(){
        super();
    }

    @Override
    public void CarregarDados() {
        this.tabela.add(new Escolaridade(1, "Ensino Médio incompleto"));
        this.tabela.add(new Escolaridade(2, "Ensino Médio Completo"));
        this.tabela.add(new Escolaridade(3, "Ensino Superior Incompleto"));
        this.tabela.add(new Escolaridade(4, "Ensino Superior completo"));
        this.tabela.add(new Escolaridade(5, "Pós Graduação Completa"));
    }
}
