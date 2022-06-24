package fr.dawan.condition;

import java.util.Scanner;

public class Exo_AnneeBissextile {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int annee;
		
		//Fournir les données d'entrée 
		System.out.print("Saisir une année : ");
		annee = input.nextInt();
		
		/*
		 * Traitement et affichage
		 * 
		 * SI l'année est divisible par 4 ET non divisible par 100
		 * OU SI  l'année est divisible par 400
		 */
		if((annee % 4 == 0 && annee % 100 != 0) || (annee % 400 == 0)) {
			System.out.println(annee + " est une année bissextile");
		} else {
			System.out.println(annee + " est une année simple");
		}
		
	}

}
