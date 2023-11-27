package cinema.fakedb;

import java.time.LocalDate;

import cinema.domínio.Sessao;

public class SessaoFakeDB extends BaseGenericaFakeDB<Sessao> {

    public SessaoFakeDB(){
        super();
    }

    @Override
    protected void CarregarDados() {
        this.tabela.add(new Sessao(1, "Vazia", "10:00", LocalDate.of(2023, 11,10)));
        this.tabela.add(new Sessao(2, "Lotada", "21:00", LocalDate.of(2023, 11, 10)));
        this.tabela.add(new Sessao(3, "Lotada", "21:50", LocalDate.of(2023, 11, 10)));
        
    }
}
