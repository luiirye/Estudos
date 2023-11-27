package cinema.fakedb;

import cinema.domínio.Ator;

public class AtorFakeDB extends BaseGenericaFakeDB<Ator> {

    public AtorFakeDB(){
        super();
    
    }

    @Override
    protected void CarregarDados() {
        this.tabela.add(new Ator(0, null, null));
        this.tabela.add(new Ator(0, null, null));
        this.tabela.add(new Ator(0, null, null));      
    }

    
    
}
