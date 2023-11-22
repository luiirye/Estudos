package clinica.dominio;

import java.time.LocalDate;
import java.util.ArrayList;

public class EspecialidadePorMedico extends Medico {

    private int codigoMedico, codigoEspecialidade;

    public int getCodigoMedico() {
        return codigoMedico;
    }

    public void setCodigoMedico(int codigoMedico) {
        this.codigoMedico = codigoMedico;
    }

    public int getCodigoEspecialidade() {
        return codigoEspecialidade;
    }

    public void setCodigoEspecialidade(int codigoEspecialidade) {
        this.codigoEspecialidade = codigoEspecialidade;
    }

    public EspecialidadePorMedico(int codigo, String nome, String email, String rg, String cpf,
            LocalDate dataNascimento, String matricula, ArrayList<RegistroCRM> crms, int codigoMedico,
            int codigoEspecialidade) {
        super(codigo, nome, email, rg, cpf, dataNascimento, matricula, crms);
        this.codigoMedico = codigoMedico;
        this.codigoEspecialidade = codigoEspecialidade;
    }

    @Override
    public String toString() {
        String espmed = "";

        espmed += "------------------------------------------------ \n";

        espmed += "BaseIdentificador [codigo=" + codigo + "] \n";

        espmed += "BasePessoa [nome=" + nome + ", email=" + email + ", rg=" + rg + ", cpf=" + cpf + ", dataNascimento="
        + dataNascimento + ", codigoProfissao=" + codigoProfissao + ", codigoEscolaridade=" + codigoEscolaridade
        + ", codigoEndereco=" + codigoEndereco + "] \n";

        espmed += "Medico [matricula=" + matricula + ", crms=" + crms + "] \n";

        espmed += "EspecialidadePorMedico [codigoMedico=" + codigoMedico + ", codigoEspecialidade=" + codigoEspecialidade + "] \n";
                 
        espmed += "------------------------------------------------ \n";
        
        return espmed; 
    }
}
