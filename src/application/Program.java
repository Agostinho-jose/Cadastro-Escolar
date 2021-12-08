package application;

import java.util.Locale;
import java.util.Scanner;
import intities.Aluno;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		System.out.print("Aluno: ");
		String nome = scan.nextLine();

		System.out.print("Matricula: ");
		String matricula = scan.nextLine();

		System.out.print("Curso: ");
		String curso = scan.nextLine();

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

		for (int i = 0; i < notaDisciplina.length; i++) {
			    System.out.println("Disciplina: " + disciplina[i]);
			for (int j = 0; j < notaDisciplina[i].length; j++) {
				System.out.print("Entre com a " + (j + 1) + "° nota: ");
				double notas = scan.nextDouble();
				notaDisciplina[i][j] = notas;
			}
		}

		Aluno aluno = new Aluno(nome, matricula, curso, disciplina, notaDisciplina, quantNotas);
		aluno.imprimirInfo();
		aluno.imprimirMedia();

		scan.close();
	}
}
