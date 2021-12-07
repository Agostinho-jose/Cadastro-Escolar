package intities;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		 Aluno al = new Aluno();
		 
		System.out.print("Aluno: ");
		al.nome = scan.nextLine();

		System.out.print("Matricula: ");
		al.matricula = scan.nextLine();
		
		System.out.print("Curso: ");
		al.curso = scan.nextLine();
		
        for(int i =0; i < al.disciplina.length; i++) {
        	 System.out.println("Entre com " + (i+1) + "° disciplina: ");
        	 al.disciplina[i] = scan.nextLine();
        	
         }  
        
        for(int i = 0; i<al.notaDisciplina.length; i++) {
        	System.out.println("Disciplina: " + al.disciplina[i]);
        	for(int j = 0; j < al.notaDisciplina[i].length; j++) {
        		System.out.println("Entre coma a" + (j+1) + "° nota: ");
        		al.notaDisciplina[i][j] = scan.nextDouble();

        	}
        }
        
        al.getInfo();
        al.getNote();
	}
}
