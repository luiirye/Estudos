package Clinica.dominio;

import java.sql.Date;

public class Responsavel extends BasePessoa {
    
    private String relacionamento;

    public String getRelacionamento() {
        return relacionamento;
    }

    public void setRelacionamento(String relacionamento) {
        this.relacionamento = relacionamento;
    }

    public Responsavel(int codigo, String nome, String email, String rg, String cpf, Date dataNascimento,
            String relacionamento) {
        super(codigo, nome, email, rg, cpf, dataNascimento);
        this.relacionamento = relacionamento;
    }
}
