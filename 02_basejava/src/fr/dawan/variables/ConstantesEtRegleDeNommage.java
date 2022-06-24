package fr.dawan.variables;

public class ConstantesEtRegleDeNommage {

	public static void main(String[] args) {
		
		System.out.println("********************CONSTANTE*****************");
		/*
		 * Les constantes doivent �tre ecrites majuscules, pour les differenciers 
		 * des autres variables.
		 * doit contenir le mot cl� final : veut dire que le contenu de ma variable 
		 * 							ne va pas changer
		 */
		final int VIES_MAX = 15;
		//VIES_MAX = 52;
		
		System.out.println("*****************REGLE DE NOMMAGE VARIABLES**********");
		//Les noms des variables doivent commencer par une lettre minuscule
		int val = 15;
		
		//Les noms des variables peuvent commencer par un underscore 
		String _val = "28";
		
		//Les mots compos�s 
		//On peut utiliser l'underscore 
		int nombre_de_vie = 5;
		
		//On peut utiliser le CamelCase 
		int nombreDeVie = 9;
		
		//Le nom d'une variable ne doit pas �tre un mot reserv� 
		//int double = 5;
		
		//Une variable ne peut pas commencer par une op�ration math�matique 
		//int -nbre = 8;
	}

}
