package fr.dawan.tableaux.tableauxStatique;

import java.util.Scanner;

/*
 * Nous verrons les tableaux statiques et les tableaux dynamiques (collections)
 * 		- Un tableau statique à une taille fixe 
 * 		  On ne peut pas le modifié une fois déclaré. 
 * 		- Un tableau dynamique nous permet de créer des tableaux de taille 
 * 		  dynamique 
 * 		  Nous pouvons augmenter et diminuer sa taille 
 * 		  Ces tableaux ne peuvent contenir que des references vers des objets
 * 
 * L'alternative aux tableaux statique, sont les tableaux dyamiques
 */
public class DeclarationEtInitialisation {

	public static void main(String[] args) {
		
		/*
		 * Partie 1 : L'utilité des tableaux
		 */
//		Scanner clavier = new Scanner(System.in);
//		int age1, age2; 
//		double moyenne;
//		
//		System.out.println("Entrer l'age de l'utilisateur1 : ");
//		age1 = clavier.nextInt();
//		
//		System.out.println("Entrer l'age de l'utilisateur2 :");
//		age2 = clavier.nextInt();
//		
//		moyenne = (age1 + age2) / 2;
//		
//		System.out.println("La moyenne des ages est : " + moyenne);
		
		/*
		 * Problème et solution : 
		 * 
		 * Problème : 
		 * Supposons qu'on a une quantité importante de donnée (ex : 27 utilisateurs)
		 * Il va falloir declarer 27 variables, ce qui est trop long, et illisible e
		 * et une perte de temps pour le programmeur
		 * 
		 * Solution : 
		 * Pour resoudre ce problème, on va utiliser les tableaux qui permettent 
		 * de stocker des éléments de même type. 
		 * 
		 * Pour cet exemple on peut stocker un tableau d'entier
		 * 
		 */
		
		
		
		/*
		 * Partie 2 : Utilisation des tableaux  
		 */
		
		/*
		 * Declaration et initialisation 
		 * Methode 1 : Si on connait les differents éléments du tableaux 
		 */
		int[] tab1 = {12, 38, 4, 98, 78};
		System.out.println(tab1[0]);  
		System.out.println(tab1[0] + tab1[2]);
		
		/*
		 * Méthode 2 : Declaration tableau si on connat la taille du tableau 
		 */
		int[] tab3 = new int[4]; //Initialisé à 0 car des entiers
		tab3[0] = 30;
		tab3[1] = 3;
		
		//tab3[4] = 27;  //erreur java.lang.ArrayIndexOutOfBoundsException
		System.out.println(tab3[0] + tab3[2]); //30
	}

}
