package curso;

/*
      Classe: A classe curso engloba todas as informações relacionadas ao curso inteiro, ou seja,
    inclui todos os semestres, e consequentemente todas suas disciplinas, o aluno, o turno,
    e o nome do curso.
        Também permite editar e ler esses parâmetros através de seus métodos.
 */

public class Curso {

    private String nome;
    private String turno;
    private Aluno aluno;
    private Semestre semestreA;
    private Semestre semestreB;
    private Semestre semestreC;
    private Semestre semestreD;
    private Semestre semestreE;
    private Semestre semestreF;
    private Semestre semestreG;
    private Semestre semestreH;



    public String getNome() {
        return nome;
    }



    public void setNome(String nome) {
        this.nome = nome;
    }



    public String getTurno() {
        return turno;
    }



    public void setTurno(String turno) {
        this.turno = turno;
    }



    public Aluno getAluno() {
        return aluno;
    }



    public void inserirAluno(Aluno aluno) {
        this.aluno = aluno;
    }



    public Semestre getSemestreA() {
        return semestreA;
    }



    public void setSemestreA(Semestre semestreA) {
        this.semestreA = semestreA;
    }



    public Semestre getSemestreB() {
        return semestreB;
    }



    public void setSemestreB(Semestre semestreB) {
        this.semestreB = semestreB;
    }



    public Semestre getSemestreC() {
        return semestreC;
    }



    public void setSemestreC(Semestre semestreC) {
        this.semestreC = semestreC;
    }



    public Semestre getSemestreD() {
        return semestreD;
    }



    public void setSemestreD(Semestre semestreD) {
        this.semestreD = semestreD;
    }



    public Semestre getSemestreE() {
        return semestreE;
    }



    public void setSemestreE(Semestre semestreE) {
        this.semestreE = semestreE;
    }



    public Semestre getSemestreF() {
        return semestreF;
    }



    public void setSemestreF(Semestre semestreF) {
        this.semestreF = semestreF;
    }



    public Semestre getSemestreG() {
        return semestreG;
    }



    public void setSemestreG(Semestre semestreG) {
        this.semestreG = semestreG;
    }



    public Semestre getSemestreH() {
        return semestreH;
    }



    public void setSemestreH(Semestre semestreH) {
        this.semestreH = semestreH;
    }


    //Retorna o semestre baseado no índice do parâmetro
    public Semestre getSemestre(int semestreIndex) {
        switch (semestreIndex) {
            case 1:
                return semestreA;
            case 2:
                return semestreB;
            case 3:
                return semestreC;
            case 4:
                return semestreD;
            case 5:
                return semestreE;
            case 6:
                return semestreF;
            case 7:
                return semestreG;
            case 8:
                return semestreH;
            default:
                return semestreA;
        }
    }

    //Lista todas as disciplinas de todos os semestres
    public void listarTodasDisciplinas() {

        String tmpStr;
        tmpStr = "Curso: " + this.nome + "\nTurno: " + this.turno + "\n";
        semestreA.listarDisciplinasSemestre();
        semestreB.listarDisciplinasSemestre();
        semestreC.listarDisciplinasSemestre();
        semestreD.listarDisciplinasSemestre();
        semestreE.listarDisciplinasSemestre();
        semestreF.listarDisciplinasSemestre();
        semestreG.listarDisciplinasSemestre();
        semestreH.listarDisciplinasSemestre();

        System.out.println(tmpStr);

    }

    //Lista todas as disciplinas já concluídas de todos os semestres
    public void listarDisciplinasCursadas() {

        String tmpStr;
        tmpStr = "Curso: " + this.nome + "\nTurno: " + this.turno + "\n";
        System.out.println(tmpStr);
        semestreA.listarDisciplinasCompletas();
        semestreB.listarDisciplinasCompletas();
        semestreC.listarDisciplinasCompletas();
        semestreD.listarDisciplinasCompletas();
        semestreE.listarDisciplinasCompletas();
        semestreF.listarDisciplinasCompletas();
        semestreG.listarDisciplinasCompletas();
        semestreH.listarDisciplinasCompletas();
    }

    //Lista todas as disciplinas atualmente em curso de todos os semestres
    public void listarDisciplinasEmCurso() {

        String tmpStr;
        tmpStr = "Curso: " + this.nome + "\nTurno: " + this.turno + "\n";
        System.out.println(tmpStr);
        semestreA.listarDisciplinasEmCurso();
        semestreB.listarDisciplinasEmCurso();
        semestreC.listarDisciplinasEmCurso();
        semestreD.listarDisciplinasEmCurso();
        semestreE.listarDisciplinasEmCurso();
        semestreF.listarDisciplinasEmCurso();
        semestreG.listarDisciplinasEmCurso();
        semestreH.listarDisciplinasEmCurso();
    }

    //Lista todas as disciplinas que faltam de todos os semestres
    public void listarDisciplinasQueFaltam() {

        String tmpStr;
        tmpStr = "Curso: " + this.nome + "\nTurno: " + this.turno + "\n";
        System.out.println(tmpStr);
        semestreA.listarDisciplinasEmFalta();
        semestreB.listarDisciplinasEmFalta();
        semestreC.listarDisciplinasEmFalta();
        semestreD.listarDisciplinasEmFalta();
        semestreE.listarDisciplinasEmFalta();
        semestreF.listarDisciplinasEmFalta();
        semestreG.listarDisciplinasEmFalta();
        semestreH.listarDisciplinasEmFalta();
    }

    //Inscreve o aluno na disciplina do semestre passados como parâmetro
    public void inscreverNaDisciplinaEmCurso(int semestre, int disciplina) {

        switch(semestre) {

            case 1:
                semestreA.setDisciplinaEmCurso(disciplina, true);
                break;
            case 2:
                semestreB.setDisciplinaEmCurso(disciplina, true);
                break;
            case 3:
                semestreC.setDisciplinaEmCurso(disciplina, true);
                break;
            case 4:
                semestreD.setDisciplinaEmCurso(disciplina, true);
                break;
            case 5:
                semestreE.setDisciplinaEmCurso(disciplina, true);
                break;
            case 6:
                semestreF.setDisciplinaEmCurso(disciplina, true);
                break;
            case 7:
                semestreG.setDisciplinaEmCurso(disciplina, true);
                break;
            case 8:
                semestreH.setDisciplinaEmCurso(disciplina, true);
                break;
        }
    }

    //Conclui a disciplina do semestre do aluno com uma nota passados como parâmetro
    public void concluirDisciplina(int semestre, int disciplina, double nota) {

        switch(semestre) {

            case 1:
                semestreA.setDisciplinaConclusao(disciplina, true, nota);
                break;
            case 2:
                semestreB.setDisciplinaConclusao(disciplina, true, nota);
                break;
            case 3:
                semestreC.setDisciplinaConclusao(disciplina, true, nota);
                break;
            case 4:
                semestreD.setDisciplinaConclusao(disciplina, true, nota);
                break;
            case 5:
                semestreE.setDisciplinaConclusao(disciplina, true, nota);
                break;
            case 6:
                semestreF.setDisciplinaConclusao(disciplina, true, nota);
                break;
            case 7:
                semestreG.setDisciplinaConclusao(disciplina, true, nota);
                break;
            case 8:
                semestreH.setDisciplinaConclusao(disciplina, true, nota);
                break;
        }
    }

    //Constutor da classe do Curso
    public Curso(String nome, String turno, Semestre semestreA, Semestre semestreB, Semestre semestreC, Semestre semestreD, Semestre semestreE, Semestre semestreF, Semestre semestreG, Semestre semestreH) {
        this.nome = nome;
        this.turno = turno;
        this.semestreA = semestreA;
        this.semestreB = semestreB;
        this.semestreC = semestreC;
        this.semestreD = semestreD;
        this.semestreE = semestreE;
        this.semestreF = semestreF;
        this.semestreG = semestreG;
        this.semestreH = semestreH;
    }
}