import curso.Disciplina;
import curso.Semestre;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    private static void preencheSemestresAlunos()
    {
        //Preenche informação dos 8 semestres
        Semestre semestreA;
        Semestre semestreB;
        Semestre semestreC;
        Semestre semestreD;
        Semestre semestreE;
        Semestre semestreF;
        Semestre semestreG;
        Semestre semestreH;
        Disciplina discA, discB, discC, discD, discE;

        //Primeiro semestre:
        discA = new Disciplina("Raciocínio Lógico", 4, "60963");
        discB = new Disciplina("Algoritmos e Programação: Fundamentos", 4, "60963");
        discC = new Disciplina("Raciocínio Lógico", 4, "60963");
        discD = new Disciplina("Raciocínio Lógico", 4, "60963");
        discE = new Disciplina("Raciocínio Lógico", 4, "60963");

    }
}