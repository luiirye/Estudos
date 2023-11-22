package clinica.fakedb;

import java.time.LocalDate;

import clinica.dominio.EspecialidadePorMedico;

public class EspecialdiadePorMedicoFakeDB extends BaseGenericaFakeDB<EspecialidadePorMedico> {

    public EspecialdiadePorMedicoFakeDB(){
        super();
    }

    @Override
    public void CarregarDados() {
        
        this.tabela.add(new EspecialidadePorMedico(10, "João", "João@medico.com", "123", "123", LocalDate.of(2000, 01, 10), null, null, 01, 100));
        this.tabela.add(new EspecialidadePorMedico(20, "Cassio", "cass@medico.com", "123", "123", LocalDate.of(2000, 01, 10), null, null, 01, 100));
        this.tabela.add(new EspecialidadePorMedico(30, "Pedro", "Pedro@medico.com", "123", "123", LocalDate.of(2000, 01, 10), null, null, 01, 100));
        this.tabela.add(new EspecialidadePorMedico(40, "Sandro", "sandro@medico.com", "123", "123", LocalDate.of(2000, 01, 10), null, null, 01, 100));
        this.tabela.add(new EspecialidadePorMedico(50, "Luis", "João@medico.com", "123", "123", LocalDate.of(2000, 01, 10), null, null, 01, 100));
    }
}
