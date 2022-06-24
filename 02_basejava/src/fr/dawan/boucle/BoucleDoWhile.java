package fr.dawan.boucle;

import java.util.Scanner;

/*
 * DO-WHILE : 
 * Permet de repeter des isntructions tant qu'une condition est verifi�e 
 * Comme la condition est test�e � la fin, on est sure de passer dans le 
 * bloc d'instruction au moins une fois 
 */
public class BoucleDoWhile {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int age = 0;
		
		do {
			System.out.print("Entrer votre age : ");
			age = input.nextInt();
			if(age <= 0) {
				System.out.println("L'age doit �tre positif\n");
			}
		}while(age < 0);
		
		System.out.println("Vous avez " + age + " ans");
		
	}

}
