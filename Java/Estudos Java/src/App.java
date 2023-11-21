//import clinica.dominio.Medico;
//import clinica.dominio.Paciente;
//import clinica.fakedb.MedicoFakeDB;
//import clinica.fakedb.PacienteFakeDB;

import clinica.dominio.Profissao;
import clinica.fakedb.ProfissaoFakeDB;

public class App {
    public static void main(String[] args) throws Exception {
        
        // MedicoFakeDB db = new MedicoFakeDB();
        // for (Medico med : db.getTabela()) {
        //     System.out.println(med.toString());
        // }

        // PacienteFakeDB db = new PacienteFakeDB();
        // for (Paciente pac : db.getTabela()) {
        //     System.out.println(pac.toString());
            
        // }
        
        ProfissaoFakeDB db = new ProfissaoFakeDB();
        for (Profissao pro : db.getTabela()) {
            System.out.println(pro.toString());
        }
    }
}