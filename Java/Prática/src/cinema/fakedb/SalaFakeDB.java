package cinema.fakedb;

import cinema.domínio.Sala;

public class SalaFakeDB extends BaseGenericaFakeDB<Sala> {

    public SalaFakeDB(){
        super();
    }

    @Override
    protected void CarregarDados() {
        this.tabela.add(new Sala(1, 100, "4K", "Sala 10"));
        this.tabela.add(new Sala(2, 100, "4K", "Sala 11"));
        this.tabela.add(new Sala(3, 100, "4K", "Sala 12"));
        
    }
}
