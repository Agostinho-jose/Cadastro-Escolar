package intities;

public class Aluno {
	
	private String nome;
	private String matricula;
	private String curso;
	private String[] disciplina;
	private double[][] notaDisciplina;
	
	public Aluno() {
		super();
	}

	public Aluno(String nome, String matricula, String curso, String[] disciplina, double[][] notaDisciplina) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.curso = curso;
		this.disciplina = disciplina;
		this.notaDisciplina = notaDisciplina;
	}

	public void getInfo() {
		 System.out.println("Nome: " + nome
					+", Matricula: " + matricula
					+", Curso: " + curso); 
		
		for(String d : disciplina) {
			System.out.println("Disciplina: " + d );
		}
	}
	
	public void getNote() {
		double s = 0;
		for(int i =0; i<notaDisciplina.length; i++) {
			System.out.println((i+1)+"° Disciplina: " + disciplina[i]);
			for(int j = 0; j < notaDisciplina[i].length; j++) {
				System.out.print((j+1)+"° Nota: " + notaDisciplina[i][j] + "\n");
				s += notaDisciplina[i][j]/3;
			}
			
			System.out.println("Media: " + s);
			if(s < 7) {
				System.out.println("Aluno Reprovado");
			} else {
				System.out.println("Aluno Aprovado");
			}
		}
	}
}
