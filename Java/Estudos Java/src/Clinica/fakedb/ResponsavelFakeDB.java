package clinica.fakedb;

import java.time.LocalDate;

import clinica.dominio.Responsavel;

public class ResponsavelFakeDB extends BaseGenericaFakeDB<Responsavel> {

    public ResponsavelFakeDB(){
        super();
    }

    
    @Override
    public void CarregarDados(){

        this.tabela.add(new Responsavel(1, "Suellen", "Suellen@responsavel.com", "123", "1234", LocalDate.of(1995, 04, 01), "Mãe"));
        this.tabela.add(new Responsavel(2, "Mario", "Mario@responsavel.com", "124", "1235", LocalDate.of(1995, 8, 01), "Pai"));
        this.tabela.add(new Responsavel(3, "Ramona", "Ramona@responsavel.com", "125", "1236", LocalDate.of(1995, 9, 01), "Avó"));
        this.tabela.add(new Responsavel(4, "Fran", "Fran@responsavel.com", "126", "1237", LocalDate.of(1995,8 , 01), "Tia"));
        this.tabela.add(new Responsavel(5, "Joel", "Joel@responsavel.com", "127", "1238", LocalDate.of(1995, 04, 01), "Tio"));
        
    }

    
}
