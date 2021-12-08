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

		String[] disciplina = new String[2];
		for (int i = 0; i < disciplina.length; i++) {
			System.out.println("Entre com " + (i + 1) + "° disciplina: ");
			String discp = scan.nextLine();
			disciplina[i] = discp;

		}

		double[][] notaDisciplina = new double[2][3];
		for(int i = 0; i < notaDisciplina.length; i++) {
           System.out.println("Disciplina: " + disciplina[i]);
        for(int j = 0; j < notaDisciplina[i].length; j++) {
		   System.out.println("Entre com a " + (j + 1) + "° nota: ");
				double notas = scan.nextDouble();
				notaDisciplina[i][j] = notas;
			}
		}
       
		Aluno aluno = new Aluno(nome, matricula, curso, disciplina, notaDisciplina);
		
		aluno.getInfo();
		aluno.getNote();

	}
}
