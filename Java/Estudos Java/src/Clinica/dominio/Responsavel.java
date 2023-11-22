package clinica.dominio;

import java.time.LocalDate;

public class Responsavel extends BasePessoa {

    private String relacionamento;

    public String getRelacionamento() {
        return relacionamento;
    }

    public void setRelacionamento(String relacionamento) {
        this.relacionamento = relacionamento;
    }

    public Responsavel(int codigo, String nome, String email, String rg, String cpf, LocalDate dataNascimento,
            String relacionamento) {
        super(codigo, nome, email, rg, cpf, dataNascimento);
        this.relacionamento = relacionamento;
    }

    @Override
    public String toString() {
        String r = "";

        r += "============================================================= \n";

        r += "Responsavel [relacionamento=" + relacionamento + "] \n";
        
        r += "BaseIdentificador [codigo=" + codigo + "] \n";

        r += "BasePessoa [nome=" + nome + ", email=" + email + ", rg=" + rg + ", cpf=" + cpf + ", dataNascimento="
        + dataNascimento + ", codigoProfissao=" + codigoProfissao + ", codigoEscolaridade=" + codigoEscolaridade
        + ", codigoEndereco=" + codigoEndereco + "] \n";

        r += "============================================================= \n";

        return r;
    }
 
    



}
