package Clinica.dominio;

public class EspecialidadePorMedico extends BaseIdentificador {

    private int codigoMedico;
    private int codigoEspecialidade;
    
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
    public EspecialidadePorMedico(int codigo, int codigoMedico, int codigoEspecialidade) {
        super(codigo);
        this.codigoMedico = codigoMedico;
        this.codigoEspecialidade = codigoEspecialidade;
    }   
}