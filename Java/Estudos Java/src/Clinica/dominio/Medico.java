package Clinica.dominio;

import java.sql.Date;
import java.time.LocalDate;

public class Medico extends BasePessoa {
    
    private String matricula;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Medico(int codigo, String nome, String email, String rg, String cpf, LocalDate localDate, String matricula) {
        super(codigo, nome, email, rg, cpf, localDate);
        this.matricula = matricula;
    }

    public Medico(int codigo, String nome, String email, String rg, String cpf, LocalDate of, String matricula2) {
    }

    

}
