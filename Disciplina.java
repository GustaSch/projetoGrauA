package curso;

public class Disciplina {
    private String nome;
    private int creditos;
    private String codigo;
    private double nota;
    private boolean conclusao;
    private boolean emCurso;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public boolean isConclusao() {
        return conclusao;
    }

    public void setConclusao(boolean conclusao) {
        this.conclusao = conclusao;
    }

    public boolean isEmCurso() {
        return emCurso;
    }

    public void setEmCurso(boolean emCurso) {
        this.emCurso = emCurso;
    }

    public Disciplina(String nome, int creditos, String codigo) {
        this.nome = nome;
        this.creditos = creditos;
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "nome='" + nome + '\'' +
                ", creditos=" + creditos +
                ", codigo='" + codigo + '\'' +
                ", nota=" + nota +
                ", conclusao=" + conclusao +
                ", emCurso=" + emCurso +
                '}';
    }
}
