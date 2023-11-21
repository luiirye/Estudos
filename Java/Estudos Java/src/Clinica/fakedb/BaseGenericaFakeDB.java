package clinica.fakedb;

import java.util.ArrayList;

public abstract class BaseGenericaFakeDB<Tdominio> {

    protected ArrayList<Tdominio> tabela;

    public ArrayList<Tdominio> getTabela(){
        if (this.tabela == null){
            this.tabela = new ArrayList<>();

        }
        return this.tabela;
    }
    
    public abstract void CarregarDados();

        public BaseGenericaFakeDB(){

        this.getTabela();
        this.CarregarDados();
    
    }

}
