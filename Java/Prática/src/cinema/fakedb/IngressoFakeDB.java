package cinema.fakedb;

import cinema.domínio.Ingresso;

public class IngressoFakeDB extends BaseGenericaFakeDB<Ingresso> {

    public IngressoFakeDB(){
        super();
    }

    @Override
    protected void CarregarDados() {
        
        this.tabela.add(new Ingresso(1, "Meia", "???"));
        this.tabela.add(new Ingresso(2, "Meia", "???"));
        this.tabela.add(new Ingresso(3, "Meia", "???"));
    }
}
