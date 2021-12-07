package intities;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		 Aluno al = new Aluno();
		 
		System.out.print("Student: ");
		al.nome = scan.nextLine();

		System.out.print("Enrollment: ");
		al.matricula = scan.nextLine();
		
		System.out.print("Course: ");
		al.curso = scan.nextLine();
		
        for(int i =0; i < al.disciplina.length; i++) {
        	 System.out.println("Enter a " + (i+1) + "° subject: ");
        	 al.disciplina[i] = scan.nextLine();
        	
         }  
        
        for(int i = 0; i<al.notaDisciplina.length; i++) {
        	System.out.println("Subject: " + al.disciplina[i]);
        	for(int j = 0; j < al.notaDisciplina[i].length; j++) {
        		System.out.println("Enter " + (j+1) + "° note: ");
        		al.notaDisciplina[i][j] = scan.nextDouble();

        	}
        	
        }
        
        al.getInfo();
        al.getNote();
	}
}
