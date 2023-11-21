import Clinica.dominio.Medico;
import Clinica.fakedb.MedicoFakeDB;

public class App {
    public static void main(String[] args) throws Exception {
        
        MedicoFakeDB db = new MedicoFakeDB();

        for (Medico med : db.getTabela()) {
            
        }
    }
}
