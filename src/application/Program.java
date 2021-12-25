package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;
import intities.Aluno;
import intities.Pessoa;
import intities.Professor;
import intities.StatusAluno;


public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");

		try {
		System.out.print("Aluno: ");
		String nome = scan.nextLine();

		System.out.print("Matricula: ");
		String matricula = scan.nextLine();

		System.out.print("Curso: ");
		String curso = scan.nextLine();

		System.out.print("Semestre: ");
		String semestre = scan.nextLine();
		
		System.out.print("Professor: ");
		String nomeProfessor = scan.nextLine();
		
		System.out.print("Departamento: ");
		String departamento = scan.nextLine();
		
		
		System.out.print("Identificação: ");
		int id = scan.nextInt();
		
		Pessoa p = new Pessoa(nome, matricula, curso, StatusAluno.valueOf(semestre), new Professor(nomeProfessor, departamento, id));
		
		System.out.print("Entre com quantidade de disciplina(s): ");
		int quant = scan.nextInt();
		scan.nextLine();
		
		String[] disciplina = new String[quant];
           for (int i = 0; i < disciplina.length; i++) {
	          System.out.print("Entre com " + (i + 1) + "° disciplina: ");
			  String discp = scan.nextLine();
			  disciplina[i] = discp;
		}

		System.out.print("Entre com quantidade de nota(s) de cada disciplina(s): ");
		int quantNotas = scan.nextInt(); //Variavel será setada na Classe Aluno, atributo mediaNotas;
		
		double[][] notaDisciplina = new double[quant][quantNotas];

		System.out.print("Date (DD/MM/YYYT): ");
		Date data = sdf.parse(scan.next());
		for (int i = 0; i < notaDisciplina.length; i++) {
		   System.out.println("Disciplina: " + disciplina[i]);
			for (int j = 0; j < notaDisciplina[i].length; j++) {
			   System.out.print("Entre com a " + (j + 1) + "° nota: ");
			   double notas = scan.nextDouble();
			   notaDisciplina[i][j] = notas;
						    
			}
		}
 
		
		Aluno a = new Aluno(data, disciplina, notaDisciplina, quantNotas);
		p.addAlunos(a);
		p.imprimirInfo();
	    p.imprimirDiscpMedia();
		scan.close();
		}
		catch(ParseException e) {
			System.out.print("Digite na formatção correta: dd/MM/yyyy");
		}
		catch(InputMismatchException e) {
			System.out.print("Digite numero inteiro");
		}
		catch(IllegalArgumentException e) {
			System.out.print("Fora de formatação. Digite PRIMEIRO_SEMESTRE, SEGUNDO_SEMESTRE...");
		}
	}
}
