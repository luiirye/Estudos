// import cinema.domínio.Ator;
// import cinema.fakedb.AtorFakeDB;
// import cinema.domínio.Filme;
// import cinema.fakedb.FilmeFakeDB;

// import cinema.domínio.Ingresso;
// import cinema.fakedb.IngressoFakeDB;

// import cinema.domínio.Sala;
// import cinema.fakedb.SalaFakeDB;

// import cinema.domínio.Sessao;
// import cinema.fakedb.SessaoFakeDB;

import cinema.domínio.FilmesPorAtor;
import cinema.fakedb.FilmesPorAtorFakeDB;

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
    
        // SalaFakeDB db = new SalaFakeDB();
        // for (Sala sala : db.getTabela()) {
        //     System.out.println(sala);
        // }
    
        // SessaoFakeDB db = new SessaoFakeDB();
        // for (Sessao sessao : db.getTabela()) {
        //     System.out.println(sessao);
        // }
    
        FilmesPorAtorFakeDB db = new FilmesPorAtorFakeDB();
        for (FilmesPorAtor fpa : db.getTabela()) {
            System.out.println(fpa);
            
        }
    }
}
