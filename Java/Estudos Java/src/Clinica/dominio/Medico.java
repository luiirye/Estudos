package Clinica.dominio;

import java.time.LocalDate;
import java.util.ArrayList;

public class Medico extends BasePessoa {
    
    private String matricula;
    private ArrayList<RegistroCRM> crms;
    
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public ArrayList<RegistroCRM> getCrms() {
        return crms;
    }
    public void setCrms(ArrayList<RegistroCRM> crms) {
        this.crms = crms;
    }
    public Medico(int codigo, String nome, String email, String rg, String cpf, LocalDate dataNascimento,
            String matricula, ArrayList<RegistroCRM> crms) {
        super(codigo, nome, email, rg, cpf, dataNascimento);
        this.matricula = matricula;
        this.crms = crms;
    }

    @Override

    public String toString(){

        String mensagem = "";
        mensagem += "----------------------------------------------------------------------------\n";
        mensagem += "BaseIdentificador [codigo = " + codigo + "] \n";
        mensagem += "BasePessoa [nome = " + nome + 
            ", email = " + email + 
            ", rg = " + rg + 
            ", cpf = " + cpf + 
            ", dataNascimento = " + dataNascimento + 
            ", codigoProfissao = " + codigoProfissao + 
            ", codigoEscolaridade = " + codigoEscolaridade + "]\n";

        mensagem += "Medico [matricula = " + matricula + ", crms = " + crms + "]\n";

        return mensagem;
    }
    
    
}
