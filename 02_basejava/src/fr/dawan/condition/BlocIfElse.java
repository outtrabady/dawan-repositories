package fr.dawan.condition;

import java.util.Scanner;

public class BlocIfElse {

	public static void main(String[] args) {
		
		/*
		 * Expression d'un test conditionnel 
		 * 
		 * Si(condition est vraie) 
		 * 		Instructions
		 * Sinon 
		 * 		D'autres instructions 
		 * 
		 * Le bloc If (Quand la condition est vraie
		 * Le bloc Else (Tous les autres cas : Quand la condition est fausse)
		 * Le bloc Else-If (traite un cas)
		 */
		Scanner input = new Scanner(System.in);
		int nbre = 0;
		
		System.out.print("Entrer un nombre SVP : ");
		nbre = input.nextInt();
		
		
		if(nbre > 0) {
			System.out.println("Le nombre est positif");
		} else if(nbre == 0) {
			System.out.println("Le nombre est égal à zero");
		} else if( nbre * nbre == 25) {
			System.out.println("Le nombre rentré est egale à " + nbre);
		} else {
			System.out.println("Le nombre est négatif");
		}
		
	}

}
