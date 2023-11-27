package cinema.fakedb;

import cinema.domínio.FilmesPorAtor;

public class FilmesPorAtorFakeDB extends BaseGenericaFakeDB<FilmesPorAtor> {

    public FilmesPorAtorFakeDB(){
        super();
    }

    @Override
    protected void CarregarDados() {
        
        this.tabela.add(new FilmesPorAtor(1, 1, 1));
        this.tabela.add(new FilmesPorAtor(2, 2, 2));
        this.tabela.add(new FilmesPorAtor(3, 3, 3));
        
    }
}
