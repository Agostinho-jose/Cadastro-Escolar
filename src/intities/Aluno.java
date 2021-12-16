package intities;

import java.util.Date;

public class Aluno {

	private Date date;
	private String[] disciplina;
	private double[][] notaDisciplina;
	
	//Atributos que recebe valor para divisão da média relacionado com quantidade de notas(quantNotas);
	private Integer mediaNotas;
	
	public Aluno(Date date, String[] disciplina, double[][] notaDisciplina, Integer mediaNotas) {
		super();
		this.date = date;
		this.disciplina = disciplina;
		this.notaDisciplina = notaDisciplina;
		this.mediaNotas = mediaNotas;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
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

	public Integer getMediaNotas() {
		return mediaNotas;
	}

	public void setMediaNotas(Integer mediaNotas) {
		this.mediaNotas = mediaNotas;
	}


//Metódo calcula e imprime notas e retorna média de cada aluno;

	public void imprimirMedia() {
		
		System.out.println();
		
		double media = 0;
		
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
	}
}
