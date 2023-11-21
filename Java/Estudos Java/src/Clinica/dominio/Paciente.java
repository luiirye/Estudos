package clinica.dominio;

import java.time.LocalDate;

public class Paciente extends BasePessoa {

    private String nomeMae;

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public Paciente(int codigo, String nome, String email, String rg, String cpf, LocalDate dataNascimento,
            String nomeMae) {
        super(codigo, nome, email, rg, cpf, dataNascimento);
        this.nomeMae = nomeMae;
    }

    @Override
    public String toString() {
        String s = ""; //Colocar as aspas vazias 

        // Colocar os "ToString" das classes que a Paciente herdou, pegar o ToString da BasePessoa, e da BaseIdentificador que herdou de BasePessoa


        s += "====================================================== \n";
        
        s += "BaseIdentificador [codigo=" + codigo + "] \n";
        
        s += "BasePessoa [nome=" + nome + ", email=" + email + ", rg=" + rg + ", cpf=" + cpf + ", dataNascimento="
        + dataNascimento + ", codigoProfissao=" + codigoProfissao + ", codigoEscolaridade=" + codigoEscolaridade
        + ", codigoEndereco=" + codigoEndereco + "] \n";

        s += "====================================================== \n";
        
        s += "Paciente [nomeMae=" + nomeMae + "] \n";

        return s;
    }
 
}
