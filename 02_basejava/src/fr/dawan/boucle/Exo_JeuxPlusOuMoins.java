package fr.dawan.boucle;

import java.util.Scanner;

public class Exo_JeuxPlusOuMoins {

	public static void main(String[] args) {
		
		Scanner clavier = new Scanner(System.in);
		
		//Nombre generer par l'ordinateur, que l'utilisateur devra trouvé 
		int nombre_secret;
		
		//Nombre que l'utilisateur rentrera à chaque fois 
		int nombreUtilisateur = 0; 
		
		//Permet à l'utilisateur de savoir en combien de coup il a trouvé le nombre 
		int nombreDeCoup = 0;
		
		//[0, 1]*999 ==> [0, 999]     ==> [0, 999] + 1 ==> [1, 1000]
		nombre_secret = (int) ((Math.random()*999) + 1);
		
		do {
			System.out.print("Entrer un nombre entre 1 et 1000 (1 - 1000) : ");
			nombreUtilisateur = clavier.nextInt();
			nombreDeCoup++;
			if(nombreUtilisateur == nombre_secret) {
				System.out.println("Trouver en " + nombreDeCoup + " essaie ! Bien joué");
			} else if (nombreUtilisateur < nombre_secret) {
				System.out.println("Votre nombre est trop petit");
			} else {
				System.out.println("Votre nombre est trop grand");
			}
		} while(nombreUtilisateur != nombre_secret);
		
	}

}
