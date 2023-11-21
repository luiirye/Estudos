package clinica.fakedb;

import java.time.LocalDate;

import clinica.dominio.Medico;

public class MedicoFakeDB extends BaseGenericaFakeDB<Medico> {

    public MedicoFakeDB(){
        super();
    }
    
    @Override
    
    public void CarregarDados(){

        this.tabela.add(new Medico(1, "Luis", "luis1@gmail.com", "1231", "12341",LocalDate.of(2000, 6, 10), "123a", null));
        this.tabela.add(new Medico(2, "Sandro", "sandro1@gmail.com", "1232", "12342",LocalDate.of(2000, 10, 10), "123a", null));
        this.tabela.add(new Medico(3, "Pedro", "pedro1@gmail.com", "1233", "12343",LocalDate.of(2000, 1, 10), "123a", null));
        this.tabela.add(new Medico(4, "Cassio", "cassio1@gmail.com", "1234", "12344",LocalDate.of(2000, 1, 10), "123a", null));
        this.tabela.add(new Medico(5, "Lara", "lara1@gmail.com", "1235", "12345",LocalDate.of(2000, 5, 10), "123a", null));

    }
}
