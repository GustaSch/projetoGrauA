package curso;

public class Aluno {

	private String nome;
	private int semestre;
	private String matricula;
	private int idade;
	private char sexo;
	
	public Aluno(String nome, int semestre, String matricula, int idade, char sexo) {
		this.nome = nome;
		this.semestre = semestre;
		this.matricula = matricula;
		this.idade = idade;
		this.sexo = sexo;
	}

	public Aluno() {}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getSemestre() {
		return semestre;
	}

	public void setSemestre(int semestre) {
		
		if((semestre > 0) && (semestre <= 8)) {
			this.semestre = semestre;
		} else {
			this.semestre = 0;
		}
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		boolean eNum = (matricula != null && matricula.matches("[0-9]+"));
		
		if(eNum == true) {
			this.matricula = matricula;
		} else {
			this.matricula = null;
		}
		
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		
		if(idade <= 100 && idade > 0) {
			this.idade = idade;
		} else {
			this.idade = 0;
		}
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		
		if(sexo == 'F' || sexo == 'M' || sexo == 'm' || sexo == 'f') {
			this.sexo = sexo;
		} else {
			this.sexo = 0;
		}
	}

	@Override
	public String toString() {
		return "Aluno{" +
					"nome=" + nome + "\"" +
					"semestre=" + semestre + "\"" +
					"matricula=" + matricula + "\"" +
					"idade=" + idade +
					"sexo=" + sexo + "\"" +
					"}";
		
	}
	
	
}