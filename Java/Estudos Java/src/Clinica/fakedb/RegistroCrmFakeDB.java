package clinica.fakedb;

import clinica.dominio.RegistroCRM;

public class RegistroCrmFakeDB extends BaseGenericaFakeDB<RegistroCRM> {

    public RegistroCrmFakeDB(){
        super();
    }

    
    @Override
    public void CarregarDados(){
        
        this.tabela.add(new RegistroCRM(1, "123a"));
        this.tabela.add(new RegistroCRM(2, "123ab"));
        this.tabela.add(new RegistroCRM(3, "123abc"));
        this.tabela.add(new RegistroCRM(4, "123abcd"));
        this.tabela.add(new RegistroCRM(5, "123abcde"));
    }
    
}
