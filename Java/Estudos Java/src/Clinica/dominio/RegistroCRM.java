package Clinica.dominio;

import java.util.ArrayList;

public abstract class RegistroCRM extends BaseIdentificador {

    private String numero;
    private ArrayList<RegistroCRM> crms;
    
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public ArrayList<RegistroCRM> getCrms() {
        return crms;
    }
    public void setCrms(ArrayList<RegistroCRM> crms) {
        this.crms = crms;
    }
    public RegistroCRM(int codigo, String numero, ArrayList<RegistroCRM> crms) {
        super(codigo);
        this.numero = numero;
        this.crms = crms;
    }
    
    @Override
    public String toString() {
        return "RegistroCRM [numero=" + numero + ", crms=" + crms + "]";
    }
}
