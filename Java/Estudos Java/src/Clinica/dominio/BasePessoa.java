package Clinica.dominio;

import java.sql.Date;
import java.util.ArrayList;

public abstract class BasePessoa extends BaseIdentificador {

    protected String nome, email, rg, cpf;
    protected Date dataNascimento;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getRg() {
        return rg;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public Date getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public BasePessoa(int codigo, String nome, String email, String rg, String cpf, Date dataNascimento) {
        super(codigo);
        this.nome = nome;
        this.email = email;
        this.rg = rg;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    protected int codigoProfissao;
    protected int codigoEscolaridade;
    protected ArrayList<Endereco> codigoEndereco;

    @Override
    public String toString() {
        return "BasePessoa [nome=" + nome + ", email=" + email + ", rg=" + rg + ", cpf=" + cpf + ", dataNascimento="
                + dataNascimento + ", codigoProfissao=" + codigoProfissao + ", codigoEscolaridade=" + codigoEscolaridade
                + ", codigoEndereco=" + codigoEndereco + "]";
    } 

    
}
