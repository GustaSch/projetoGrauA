package curso;

public class Aluno {

	/*
		Classe: A classe Aluno é encarregada de portar as informações sobre o aluno cadastrado
	  no curso.

	  O aluno possui as seguintes informações:
		- Nome do aluno
		- Semestre do aluno
		- Matrícula do aluno
		- Idade do aluno
		- Sexo do aluno
	 */

	private String nome;
	private int semestre;
	private String matricula;
	private int idade;
	private char sexo;

	//Construtor da classe de aluno com parâmetros predefinidos
	public Aluno(String nome, int semestre, String matricula, int idade, char sexo) {
		this.nome = nome;
		this.semestre = semestre;
		this.matricula = matricula;
		this.idade = idade;
		this.sexo = sexo;
	}

	//Construtor vazio da classe
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

	//Configura o semestre atual de um aluno no curso
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

	//Controla o número de matrícula de um aluno
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

	//Limita a idade de um aluno do curso
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

	//Controla o sexo de um aluno
	public void setSexo(char sexo) {
		
		if(sexo == 'F' || sexo == 'M' || sexo == 'm' || sexo == 'f') {
			this.sexo = sexo;
		} else {
			this.sexo = 0;
		}
	}

	//Retorna as informações do aluno em uma string
	@Override
	public String toString() {
		return "Aluno{" +
					"nome='" + nome + '\'' +
					"semestre='" + semestre + '\'' +
					"matricula='" + matricula + '\'' +
					"idade='" + idade + '\'' +
					"sexo='" + sexo + '\'' +
					"}";
		
	}
	
	
}