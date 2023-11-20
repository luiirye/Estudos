package Clinica.dominio;

import java.sql.Date;

public class Medico extends BasePessoa {
    
    private String matricula;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Medico(int codigo, String nome, String email, String rg, String cpf, Date dataNascimento, String matricula) {
        super(codigo, nome, email, rg, cpf, dataNascimento);
        this.matricula = matricula;
    }
}
