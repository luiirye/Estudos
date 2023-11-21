package Clinica.fakedb;

import java.time.LocalDate;

import Clinica.dominio.Medico;

public class MedicoFakeDB extends BaseGenericaFakeDB<Medico>{

   public MedicoFakeDB(){
        super();
   }
    
    @Override
    public void CarregadarDados() {
        this.tabela.add (new Medico(1, "Luis", "luis@gmail.com", "1234", "123456", LocalDate.of(1993, 9, 20), "123abc"));
        this.tabela.add (new Medico(1, "Luis", "luis@gmail.com", "1234", "123456", LocalDate.of(1993, 9, 20), "123abc"));
        this.tabela.add (new Medico(1, "Luis", "luis@gmail.com", "1234", "123456", LocalDate.of(1993, 9, 20), "123abc"));
        this.tabela.add (new Medico(1, "Luis", "luis@gmail.com", "1234", "123456", LocalDate.of(1993, 9, 20), "123abc"));
        this.tabela.add (new Medico(1, "Luis", "luis@gmail.com", "1234", "123456", LocalDate.of(1993, 9, 20), "123abc"));
    }
}
