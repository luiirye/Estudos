package Clinica.fakedb;

import java.time.LocalDate;

import Clinica.dominio.Medico;

public class MedicoFakeDB extends BaseGenericaFakeDB<Medico> {

    public MedicoFakeDB(){
        super();
    }

    @Override
    public void CarregadarDados() {
       this.tabela.add(new Medico(1, "Luis", "Luis@gmail.com", "121", "123451", LocalDate.of(1999, 01, 01), "123abc"));
       this.tabela.add(new Medico(2, "Luis", "Luis@gmail.com", "122", "123452", LocalDate.of(2000, 02, 02), "123abcd"));
       this.tabela.add(new Medico(3, "Luis", "Luis@gmail.com", "123", "123453", LocalDate.of(2001, 03, 03), "123abcde"));
       this.tabela.add(new Medico(4, "Luis", "Luis@gmail.com", "124", "123454", LocalDate.of(2002, 04, 04), "123abcdef"));
       this.tabela.add(new Medico(5, "Luis", "Luis@gmail.com", "125", "123455", LocalDate.of(2003, 05, 05), "123abcdefg")); 
    }

    
    
}
