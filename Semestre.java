package curso;

public class Semestre {

    /*
      Informações da classe:
      - Número do semestre
      - Ano do semestre
      - 7 disciplinas
     */

    private int numero;
    private Disciplina discA;
    private Disciplina discB;
    private Disciplina discC;
    private Disciplina discD;
    private Disciplina discE;
    private Disciplina discF;
    private Disciplina discG;
    private String ano;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if(numero > 0 && numero <= 8){
            this.numero = numero;
        } else {
            this.numero = 0;
        }
    }

    public Disciplina getDiscA() {
        return discA;
    }

    public void setDiscA(Disciplina discA) {
        this.discA = discA;
    }

    public Disciplina getDiscB() {
        return discB;
    }

    public void setDiscB(Disciplina discB) {
        this.discB = discB;
    }

    public Disciplina getDiscC() {
        return discC;
    }

    public void setDiscC(Disciplina discC) {
        this.discC = discC;
    }

    public Disciplina getDiscD() {
        return discD;
    }

    public void setDiscD(Disciplina discD) {
        this.discD = discD;
    }

    public Disciplina getDiscE() {
        return discE;
    }

    public void setDiscE(Disciplina discE) {
        this.discE = discE;
    }

    public Disciplina getDiscF() {
        return discF;
    }

    public void setDiscF(Disciplina discF) {
        this.discF = discF;
    }

    public Disciplina getDiscG() {
        return discG;
    }

    public void setDiscG(Disciplina discG) {
        this.discG = discG;
    }

    //recebe como parâmetro o índice da disciplina e o estado (se está ou não em curso)
    public void setDisciplinaEmCurso(int numDisciplina, boolean estado) {
        switch (numDisciplina) {
            case 1:
                this.discA.setEmCurso(estado);
                break;
            case 2:
                this.discB.setEmCurso(estado);
                break;
            case 3:
                this.discC.setEmCurso(estado);
                break;
            case 4:
                this.discD.setEmCurso(estado);
                break;
            case 5:
                this.discE.setEmCurso(estado);
                break;
            case 6:
                this.discF.setEmCurso(estado);
                break;
            case 7:
                this.discG.setEmCurso(estado);
                break;
        }
    }

    public Disciplina getDisciplina(int numDisciplina) {
        switch (numDisciplina) {
            case 1:
                return this.discA;
            case 2:
                return this.discB;
            case 3:
                return this.discC;
            case 4:
                return this.discD;
            case 5:
                return this.discE;
            case 6:
                return this.discF;
            case 7:
                if (!this.discG.getNome().isEmpty()) {
                    return this.discG;
                } else {
                    return null;
                }
            default:
                return null;
        }
    }

    //Recebe como parâmetro um índice da disciplina e o estado (se foi ou não concluída)
    public void setDisciplinaConclusao(int numDisciplina, boolean estado, double nota) {
        switch (numDisciplina) {
            case 1:
                this.discA.setNota(nota);
                this.discA.setConclusao(estado);
                break;
            case 2:
                this.discB.setNota(nota);
                this.discB.setConclusao(estado);
                break;
            case 3:
                this.discC.setNota(nota);
                this.discC.setConclusao(estado);
                break;
            case 4:
                this.discD.setNota(nota);
                this.discD.setConclusao(estado);
                break;
            case 5:
                this.discE.setNota(nota);
                this.discE.setConclusao(estado);
                break;
            case 6:
                this.discF.setNota(nota);
                this.discF.setConclusao(estado);
                break;
            case 7:
                this.discG.setNota(nota);
                this.discG.setConclusao(estado);
                break;
        }
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Semestre{" +
                "numero=" + numero +
                ", discA=" + discA.toString() +
                ", discB=" + discB.toString() +
                ", discC=" + discC.toString() +
                ", discD=" + discD.toString() +
                ", discE=" + discE.toString() +
                ", discF=" + discF.toString() +
                ", discG=" + discG.toString() +
                ", ano='" + ano + '\'' +
                '}';
    }

    public Semestre(int numero, Disciplina discA, Disciplina discB, Disciplina discC, Disciplina discD, Disciplina discE, Disciplina discF, Disciplina discG, String ano) {
        setNumero(numero);
        setDiscA(discA);
        setDiscB(discB);
        setDiscC(discC);
        setDiscD(discD);
        setDiscE(discE);
        setDiscF(discF);
        setDiscG(discG);
        setAno(ano);
    }

    public void listarDisciplinasSemestre() {
        String tmpStr;
        tmpStr = "Semestre: " + this.numero + "\nAno: " + this.ano + "\n";
        tmpStr += discA.toString() + "\n";
        tmpStr += discB.toString() + "\n";
        tmpStr += discC.toString() + "\n";
        tmpStr += discD.toString() + "\n";
        tmpStr += discE.toString() + "\n";
        tmpStr += discF.toString() + "\n";
        tmpStr += discG.toString() + "\n";

        System.out.println(tmpStr);
    }

    public void listarDisciplinasCompletas() {
        String tmpStr = "";
        if (discA.isConclusao()) {
            tmpStr += discA.toString() + "\n";
        }

        if (discB.isConclusao()) {
            tmpStr += discB.toString() + "\n";
        }

        if (discC.isConclusao()) {
            tmpStr += discC.toString() + "\n";
        }

        if (discD.isConclusao()) {
            tmpStr += discD.toString() + "\n";
        }

        if (discE.isConclusao()) {
            tmpStr += discE.toString() + "\n";
        }

        if (discF.isConclusao()) {
            tmpStr += discF.toString() + "\n";
        }

        if (discG.isConclusao()) {
            tmpStr += discG.toString() + "\n";
        }

        if (tmpStr.length() > 1) {
            tmpStr = "Semestre: " + this.numero + "\nAno: " + this.ano + "\n" + tmpStr;
        } else {
            tmpStr = "Semestre: " + this.numero + "\nAno: " + this.ano + "\nNenhuma matéria completa!";
        }

        System.out.println(tmpStr);
    }

    public void listarDisciplinasEmCurso() {
        String tmpStr = "";
        if (discA.isEmCurso()) {
            tmpStr += discA.toString() + "\n";
        }

        if (discB.isEmCurso()) {
            tmpStr += discB.toString() + "\n";
        }

        if (discC.isEmCurso()) {
            tmpStr += discC.toString() + "\n";
        }

        if (discD.isEmCurso()) {
            tmpStr += discD.toString() + "\n";
        }

        if (discE.isEmCurso()) {
            tmpStr += discE.toString() + "\n";
        }

        if (discF.isEmCurso()) {
            tmpStr += discF.toString() + "\n";
        }

        if (discG.isEmCurso()) {
            tmpStr += discG.toString() + "\n";
        }

        if (tmpStr.length() > 1) {
            tmpStr = "Semestre: " + this.numero + "\nAno: " + this.ano + "\n" + tmpStr;
        } else {
            tmpStr = "Semestre: " + this.numero + "\nAno: " + this.ano + "\nNenhuma matéria em curso!";
        }

        System.out.println(tmpStr);
    }

    public void listarDisciplinasEmFalta() {
        String tmpStr = "";
        if (!discA.isEmCurso() && !discA.isConclusao()) {
            tmpStr += discA.toString() + "\n";
        }

        if (!discB.isEmCurso() && !discB.isConclusao()) {
            tmpStr += discB.toString() + "\n";
        }

        if (!discC.isEmCurso() && !discC.isConclusao()) {
            tmpStr += discC.toString() + "\n";
        }

        if (!discD.isEmCurso() && !discD.isConclusao()) {
            tmpStr += discD.toString() + "\n";
        }

        if (!discE.isEmCurso() && !discE.isConclusao()) {
            tmpStr += discE.toString() + "\n";
        }

        if (!discF.isEmCurso() && !discF.isConclusao()) {
            tmpStr += discF.toString() + "\n";
        }

        if (!discG.isEmCurso() && !discG.isConclusao()) {
            tmpStr += discG.toString() + "\n";
        }


        if (tmpStr.length() > 1) {
            tmpStr = "Semestre: " + this.numero + "\nAno: " + this.ano + "\n" + tmpStr;
        } else {
            tmpStr = "Semestre: " + this.numero + "\nAno: " + this.ano + "\nNenhuma matéria em falta!";
        }

        System.out.println(tmpStr);
    }

    public int getCreditosUtilizados() {
        int creditosSemestre = 0;
        if (discA.isEmCurso()) {
            creditosSemestre += discA.getCreditos();
        }

        if (discB.isEmCurso()) {
            creditosSemestre += discB.getCreditos();
        }

        if (discC.isEmCurso()) {
            creditosSemestre += discC.getCreditos();
        }

        if (discD.isEmCurso()) {
            creditosSemestre += discD.getCreditos();
        }

        if (discE.isEmCurso()) {
            creditosSemestre += discE.getCreditos();
        }

        if (discF.isEmCurso()) {
            creditosSemestre += discF.getCreditos();
        }

        if (discG.isEmCurso()) {
            creditosSemestre += discG.getCreditos();
        }

        if (creditosSemestre > 0) {
            System.out.println("Semestre: " + this.numero + "\nAno: " + this.ano + "\nCreditos Utilizados: " + creditosSemestre);
        } else {
            System.out.println("Semestre: " + this.numero + "\nAno: " + this.ano + "\nNenhum crédito utilizado no semestre!");
        }

        return creditosSemestre;
    }
}
