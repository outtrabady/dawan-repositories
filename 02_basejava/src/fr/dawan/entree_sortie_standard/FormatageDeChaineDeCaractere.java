package fr.dawan.entree_sortie_standard;

/**
 * 
 * @author Admin stagiaire
 *
 *Nous allons voir lé méthode printf et String.format
 *Elle nous permet d'afficher, de produire des chaines de caractères 
 *formatées 
 */
public class FormatageDeChaineDeCaractere {

	public static void main(String[] args) {
		
		/*
		 * Les sorties formatées : Le format de ce qui va être affiché 
		 * 
		 * %s Permet  de formater une chaine de caractère 
		 * %c Permet de formater un caractère 
		 * %d Permet de formater un entier en base de decimal 
		 * %f Permet de formater un réel sous forme décimale 
		 * %n ou \n retourne à la ligne
		 * 
		 */
		
		int dividende = 25; 
		int diviseur = 11;
		
		//1er solution utilsation println ==> [25/11]
		System.out.println("[" + dividende + " / " + diviseur + "]");
		
		//2ème soution : Utilisation de la printf
		System.out.printf("[%d/%d]%n", dividende, diviseur);
		
		//3ème solution String.format 
		String str = String.format("[%d/%d]%n", dividende, diviseur);
		System.out.println(str);
		
		System.out.println(Math.PI);
		
		//Arondir la valeur de PI avec deux chiffres après la virgule 
		System.out.printf("%.2f%n", Math.PI);
		
		
		
		
		
		
		
	}

}
