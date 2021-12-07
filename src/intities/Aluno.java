package intities;

public class Aluno {
	
	String nome;
	String matricula;
	String curso;
	String[] disciplina = new String[2];
	double[][] notaDisciplina = new double[2][3];
	
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
			System.out.println((i+1)+"° subject: " + disciplina[i]);
			for(int j = 0; j < notaDisciplina[i].length; j++) {
				System.out.print((j+1)+"° Nota: " + notaDisciplina[i][j] + "\n");
				s += notaDisciplina[i][j]/3;
			}
			
			System.out.println("Media: " + s);
			if(s < 7) {
				System.out.println("Reprovado");
			} else {
				System.out.println("Aprovado");
			}
		}
	}
}
