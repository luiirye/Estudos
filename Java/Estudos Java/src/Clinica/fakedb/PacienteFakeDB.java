package clinica.fakedb;

import java.time.LocalDate;

import clinica.dominio.Paciente;

public class PacienteFakeDB extends BaseGenericaFakeDB<Paciente> {

    //Primeira coisa, tem que fazer o construtor:

    public PacienteFakeDB(){
        super();

    }
    
    //Depois, construir o CarregarDados para imprimir no Appjava

    @Override
    public void CarregarDados() {
        this.tabela.add(new Paciente(1, "Luis Felipe", "Luis10@paciente.com", "121", "12341", LocalDate.of(2000, 06, 01), "Suellen"));    
        this.tabela.add(new Paciente(2, "Pedro", "Pedro11@paciente.com", "122", "12342", LocalDate.of(2000, 06, 01), "Suellen"));
        this.tabela.add(new Paciente(3, "Sandro", "Sandro12@paciente.com", "123", "12343", LocalDate.of(2000, 06, 01), "Suellen"));
        this.tabela.add(new Paciente(4, "Cassio", "Cassio13@paciente.com", "124", "12344", LocalDate.of(2000, 06, 01), "Suellen"));
        this.tabela.add(new Paciente(5, "Ruan", "Ruan14@paciente.com", "125", "12345", LocalDate.of(2000, 06, 01), "Suellen"));
    }


    
}
