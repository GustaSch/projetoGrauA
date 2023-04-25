package curso;

public class Semestre {

    private int numero;
    private Disciplina discA;
    private Disciplina discB;
    private Disciplina discC;
    private Disciplina discD;
    private Disciplina discE;
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

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        boolean eNum = (ano != null && ano.matches("[0-9]+"));

        if(eNum == true){
            this.ano = ano;
        } else {
            this.ano = null;
        }
    }

    @Override
    public String toString() {
        return "Semestre{" +
                "numero=" + numero +
                ", discA=" + discA +
                ", discB=" + discB +
                ", discC=" + discC +
                ", discD=" + discD +
                ", discE=" + discE +
                ", ano='" + ano + '\'' +
                '}';
    }

    public Semestre(int numero, Disciplina discA, Disciplina discB, Disciplina discC, Disciplina discD, Disciplina discE, String ano) {
        setNumero(numero);
        setDiscA(discA);
        setDiscB(discB);
        setDiscC(discC);
        setDiscD(discD);
        setDiscE(discE);
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

        if (creditosSemestre > 0) {
            System.out.println("Semestre: " + this.numero + "\nAno: " + this.ano + "\nCreditos Utilizados: " + creditosSemestre);
        } else {
            System.out.println("Semestre: " + this.numero + "\nAno: " + this.ano + "\nNenhum crédito utilizado no semestre!");
        }

        return creditosSemestre;
    }
}
