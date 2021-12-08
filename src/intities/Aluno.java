package intities;

public class Aluno {

	private String nome;
	private String matricula;
	private String curso;
	private String[] disciplina;
	private double[][] notaDisciplina;
	
	//Atributos que recebe valor para divisão da média relacionado com quantidade de notas(quantNotas);
	private int mediaNotas;

	public Aluno() {
		super();
	}

	public Aluno(String nome, String matricula, String curso, String[] disciplina, double[][] notaDisciplina,
			int mediaNotas) {
		
		this.nome = nome;
		this.matricula = matricula;
		this.curso = curso;
		this.disciplina = disciplina;
		this.notaDisciplina = notaDisciplina;
		this.mediaNotas = mediaNotas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String[] getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String[] disciplina) {
		this.disciplina = disciplina;
	}

	public double[][] getNotaDisciplina() {
		return notaDisciplina;
	}

	public void setNotaDisciplina(double[][] notaDisciplina) {
		this.notaDisciplina = notaDisciplina;
	}

	public int getMediaNotas() {
		return mediaNotas;
	}

	public void setMediaNotas(int mediaNotas) {
		this.mediaNotas = mediaNotas;
	}

//Imprimir dados na tela;
	public void imprimirInfo() {
		System.out.println("\nNome: " + this.getNome() 
		+ ", Matricula: " + this.getMatricula() 
		+ ", Curso: " + this.getCurso() + "\n");
		
		for (String d : this.disciplina) {
			System.out.println("Disciplina(s): " + d + "\n");
		}
	}

//Metódo calcula e imprime notas e retorna média de cada aluno;

	public double imprimirMedia() {
		
		double media = 0;
		System.out.println("Curso: " + this.getCurso());
		
		for (int i = 0; i < this.notaDisciplina.length; i++) {
			
			System.out.println((i + 1) + "° Disciplina: " + this.disciplina[i]);
			for (int j = 0; j < this.notaDisciplina[i].length; j++) {
				System.out.print((j + 1) + "° Nota: " + this.notaDisciplina[i][j] + "\n");
				media += (this.notaDisciplina[i][j]) / this.mediaNotas;
			}

			System.out.println("Média: " + media);
			if (media < 7) {
				media = 0;// zera variável
				System.out.println("Aluno Reprovado");
			} else {
				media = 0;// zera variável
				System.out.println("Aluno Aprovado");
			}
			
			System.out.println();
		}

		return media;
		
	}
}
