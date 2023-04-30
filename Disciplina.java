package curso;

/*
      Classe: A classe disciplina armazena as informações de uma disciplina de um semestre do curso,
    como seu nome, a nota, código, quantidade de créditos necessários, se está atualmente em curso
    e se foi concluída, além dos métodos para modificar tais parâmetros.
 */

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

    //Seta a nota na disciplina
    public void setNota(double nota) {
        if(nota >= 0 || nota <= 10) {
            this.nota = nota;
        }
    }

    public boolean isConclusao() {
        return conclusao;
    }

    //Conclui a disciplina, se a nota estiver acima da média (6)
    public void setConclusao(boolean conclusao) {

        if (conclusao == true) {
            if (this.nota < 6) {
                System.out.println(this.nome + " não pode ser concluída pois a nota está abaixo da média.");
                conclusao = false;
            } else {
                this.emCurso = false;
            }
        }
        this.conclusao = conclusao;
    }

    public boolean isEmCurso() {
        return emCurso;
    }

    //Seta o estado atual do parâmetro emCurso da disciplina (com proteções caso já esteja concluída)
    public void setEmCurso(boolean emCurso) {
        if (emCurso == true && this.conclusao == true)
        {
            System.out.println("Curso já concluído!");
            this.emCurso = false;
        } else {
            this.emCurso = emCurso;
        }
    }

    //Construtor da disciplina (note que obrigatoriamente ao ser construída, a disciplina está com as propriedades
    //  emCurso e conclusao em false)
    public Disciplina(String nome, int creditos, String codigo) {
        this.nome = nome;
        this.creditos = creditos;
        this.codigo = codigo;
        this.nota = 0;
        this.emCurso = false;
        this.conclusao = false;
    }

    //Retorna informações da disciplina em uma string
    @Override
    public String toString() {
        if (!nome.isEmpty()) {
            return "Disciplina{" +
                    "nome='" + nome + '\'' +
                    ", creditos=" + creditos +
                    ", codigo='" + codigo + '\'' +
                    ", nota=" + nota +
                    ", conclusao=" + conclusao +
                    ", emCurso=" + emCurso +
                    '}';
        } else {
            return "";
        }
    }
}
