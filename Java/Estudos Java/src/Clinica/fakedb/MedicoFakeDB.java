package Clinica.fakedb;

import java.time.LocalDate;

import Clinica.dominio.Medico;

public class MedicoFakeDB extends BaseGenericaFakeDB<Medico>{

   public MedicoFakeDB(){
        super();
   }
    
    @Override
    public void CarregadarDados() {
        this.tabela.add (new Medico(0, null, null, null, null, null, null, null);
}
