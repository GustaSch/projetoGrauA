package curso;

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

	
	public void listarTodasDisciplinas() {
		
		String tmpStr;
        tmpStr = "Curso: " + this.nome + "\nTurno: " + this.turno + "\n";
        tmpStr += semestreA.toString() + "\n";
        tmpStr += semestreB.toString() + "\n";
        tmpStr += semestreC.toString() + "\n";
        tmpStr += semestreD.toString() + "\n";
        tmpStr += semestreE.toString() + "\n";
        tmpStr += semestreF.toString() + "\n";
        tmpStr += semestreG.toString() + "\n";
        tmpStr += semestreH.toString() + "\n";

        System.out.println(tmpStr);
    
	}
	
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
}
