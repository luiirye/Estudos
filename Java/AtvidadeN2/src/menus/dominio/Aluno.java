package menus.dominio;

public abstract class Aluno {
    
    protected int codigo;
    protected String nome;
    protected double notaA1, notaP1, notaA2, notaP2, media;
    
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getNotaA1() {
        return notaA1;
    }
    public void setNotaA1(double notaA1) {
        this.notaA1 = notaA1;
    }
    public double getNotaP1() {
        return notaP1;
    }
    public void setNotaP1(double notaP1) {
        this.notaP1 = notaP1;
    }
    public double getNotaA2() {
        return notaA2;
    }
    public void setNotaA2(double notaA2) {
        this.notaA2 = notaA2;
    }
    public double getNotaP2() {
        return notaP2;
    }
    public void setNotaP2(double notaP2) {
        this.notaP2 = notaP2;
    }
    public double getMedia() {
        return media;
    }
    public void setMedia(double media) {
        this.media = media;
    }
    public Aluno(int codigo, String nome, double notaA1, double notaP1, double notaA2, double notaP2, double media) {
        this.codigo = codigo;
        this.nome = nome;
        this.notaA1 = notaA1;
        this.notaP1 = notaP1;
        this.notaA2 = notaA2;
        this.notaP2 = notaP2;
        this.media = media;
    }

    

}
