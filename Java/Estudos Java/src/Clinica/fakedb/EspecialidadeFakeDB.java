package clinica.fakedb;

import clinica.dominio.Especialidade;

public class EspecialidadeFakeDB extends BaseGenericaFakeDB<Especialidade> {

    public EspecialidadeFakeDB(){
        super();
    }

    @Override
    public void CarregarDados() {
        this.tabela.add(new Especialidade(10, "Pediatria"));
        this.tabela.add(new Especialidade(20, "???"));
        this.tabela.add(new Especialidade(30, "Enfermeiro"));
        this.tabela.add(new Especialidade(40, "Clínico Geral"));
        this.tabela.add(new Especialidade(50, "Cirurgião"));
    }
}
