package fr.dawan.tableaux.tableauxStatique;

import java.util.Scanner;

public class Exo_InsertionElementTableau {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		double[] liste_notes;  //Pour initialiser le tableau 
		
		double note;  //note à inserer 
		
		//pos : position d'insertion de la note 
		//N : Nombre de notes dans le tableau
		int N, position; //N : Le nombre de note correspodant à la taille actuelle du tableau
		
		String result = "";
		
		//1- Saisir la taille actuelle du tableau 
		System.out.print("Saisir le nombre de notes : ");
		N = input.nextInt();
		
		//2-Initialiser la taille du tableau contenant la liste des notes 
		liste_notes = new double[N + 1];
		
		
		/*
		 * Boucle de chargement 
		 * Le chargement lit une suite de valeurs et les ranges dans les cases 
		 * successives du tableau. 
		 * On va utiliser la boucle for pour le chargemetn
		 */
		//1-Saisir les notes dans le tableau 
		for(int i = 0; i < N; i++) {
			System.out.print("Note " + (i + 1) + " : ");
			liste_notes[i] = input.nextDouble();
		}
		
		//2-Saisir une note et sa position d'insertion
		System.out.print("Note à inserer : ");
		note = input.nextDouble();	
		System.out.print("Position : ");
		position = input.nextInt();  //ex : position = 3 (indice = 2)
		int numCase = position - 1; //numCase = indice
	
		//2.1 Verifier si la position est non valide 
		if(position <= 0 || position > N + 1) {
			System.out.println("Position invalide ! Veuillez saisir une position "
					+ "entre 1 et "  + N);
		} else {
			//2.2 Decalage des cases : On part de la fin pour remonter vers la position d'insertion (numCase)
			for (int i = N; i > numCase; i--) {
				liste_notes[i] = liste_notes[i-1];
			}
			
			//2.3 Inserer la note à la position donnée et incrementer N
			liste_notes[numCase] = note;
			N++;
		}
		
		/*
		 * Boucle d'affichage (For)
		 * [8.5, 9.5, 11.0, 12.5, 18]
		 */
		result = "[";
		for (int i = 0; i < N - 1; i++) {
			result+=liste_notes[i] + ", " ; //val = val + 5; ==> val += 5;
		}
		
		result += liste_notes[liste_notes.length  - 1] + "]";
		
		System.out.println(result);
	}

}
