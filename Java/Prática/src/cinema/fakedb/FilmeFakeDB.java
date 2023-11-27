package cinema.fakedb;

import cinema.domínio.Filme;

public class FilmeFakeDB extends BaseGenericaFakeDB<Filme> {

    public FilmeFakeDB(){
        super();
    }

    @Override
    protected void CarregarDados() {
        this.tabela.add(new Filme(1, "The Batman", "Suspense", 223));
        this.tabela.add(new Filme(2, "The Batman", "Suspense", 223));
        this.tabela.add(new Filme(3, "The Batman", "Suspense", 223));
        
    }
    
    

}
