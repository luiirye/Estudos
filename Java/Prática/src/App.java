// import cinema.domínio.Ator;
// import cinema.fakedb.AtorFakeDB;
// import cinema.domínio.Filme;
// import cinema.fakedb.FilmeFakeDB;

// import cinema.domínio.Ingresso;
// import cinema.fakedb.IngressoFakeDB;

import cinema.domínio.Sala;
import cinema.fakedb.SalaFakeDB;

public class App {
    public static void main(String[] args) throws Exception {
        
    //     AtorFakeDB db = new AtorFakeDB();
    //     for (Ator ator : db.getTabela()) {
    //         System.out.println(ator);
    //     }
    
    // FilmeFakeDB db = new FilmeFakeDB();
    //     for (Filme film : db.getTabela()) {
    //         System.out.println(film);
            
    //     }
    
        // IngressoFakeDB db = new IngressoFakeDB();
        // for (Ingresso ing : db.getTabela()) {
        //     System.out.println(ing);
        // }
    
        SalaFakeDB db = new SalaFakeDB();
        for (Sala sala : db.getTabela()) {
            System.out.println(sala);
        }
    }
}
