//import clinica.dominio.Medico;
//import clinica.dominio.Paciente;
//import clinica.fakedb.MedicoFakeDB;
//import clinica.fakedb.PacienteFakeDB;

//import clinica.dominio.Profissao;
//import clinica.fakedb.ProfissaoFakeDB;

//import clinica.dominio.Responsavel;
//import clinica.fakedb.ResponsavelFakeDB;

import clinica.dominio.RegistroCRM;
import clinica.fakedb.RegistroCrmFakeDB;

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
        
        // ProfissaoFakeDB db = new ProfissaoFakeDB();
        // for (Profissao pro : db.getTabela()) {
        //     System.out.println(pro.toString());
        // }
    
        // ResponsavelFakeDB db = new ResponsavelFakeDB();
        // for (Responsavel res : db.getTabela()) {
        //     System.out.println(res.toString());
            
       //}
    
        RegistroCrmFakeDB db = new RegistroCrmFakeDB();
        for (RegistroCRM crm : db.getTabela()) {
            System.out.println(crm.toString());
            
        }
    }
}