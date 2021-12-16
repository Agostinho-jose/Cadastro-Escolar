package intities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

    public class Pessoa {

	private String nome;
	private String matricula;
	private String curso;
    
	private Professor professor; 
	
	private StatusAluno aluno;
	private List<Aluno> alunos = new ArrayList<>();

	public Pessoa() {
	}

	public Pessoa(String nome, String matricula, String curso, StatusAluno aluno, Professor professor) {

		this.nome = nome;
		this.matricula = matricula;
		this.curso = curso;
		this.aluno = aluno;
		this.professor = professor;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
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

	public StatusAluno getAluno() {
		return aluno;
	}

	public void setAluno(StatusAluno aluno) {
		this.aluno = aluno;
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void addAlunos(Aluno notas) {

		alunos.add(notas);
	}

	public void removeAlunos(Aluno notas) {

		alunos.add(notas);
	}

	public void imprimirInfo() {

		System.out.println("\nNome: " + this.getNome() + "\tMatricula: " + this.getMatricula() 
		+ "\nCurso: " + this.getCurso() + "\tSemestre: " + this.getAluno()
		+ "\n" + professor.toString());

	}

	public void imprimirDiscpMedia() {
		
		Calendar cal = Calendar.getInstance();
		
		for(Aluno al : alunos) {
			cal.setTime(al.getDate());
			al.imprimirMedia();
		}
	}
}
