package cinema.domínio;

import java.time.LocalDate;

public class Sessao extends BaseIdentificador {

    private String statusDaSessao, horario;
    private LocalDate data;
    
    public String getStatusDaSessao() {
        return statusDaSessao;
    }
    public void setStatusDaSessao(String statusDaSessao) {
        this.statusDaSessao = statusDaSessao;
    }
    public String getHorario() {
        return horario;
    }
    public void setHorario(String horario) {
        this.horario = horario;
    }
    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }
    public Sessao(int codigo, String statusDaSessao, String horario, LocalDate data) {
        super(codigo);
        this.statusDaSessao = statusDaSessao;
        this.horario = horario;
        this.data = data;
    }

    
    
}
