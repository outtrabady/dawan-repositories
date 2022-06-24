package fr.dawan.entree_sortie_standard;

/**
 * 
 * @author Admin stagiaire
 *
 *Nous allons voir l� m�thode printf et String.format
 *Elle nous permet d'afficher, de produire des chaines de caract�res 
 *format�es 
 */
public class FormatageDeChaineDeCaractere {

	public static void main(String[] args) {
		
		/*
		 * Les sorties format�es : Le format de ce qui va �tre affich� 
		 * 
		 * %s Permet  de formater une chaine de caract�re 
		 * %c Permet de formater un caract�re 
		 * %d Permet de formater un entier en base de decimal 
		 * %f Permet de formater un r�el sous forme d�cimale 
		 * %n ou \n retourne � la ligne
		 * 
		 */
		
		int dividende = 25; 
		int diviseur = 11;
		
		//1er solution utilsation println ==> [25/11]
		System.out.println("[" + dividende + " / " + diviseur + "]");
		
		//2�me soution : Utilisation de la printf
		System.out.printf("[%d/%d]%n", dividende, diviseur);
		
		//3�me solution String.format 
		String str = String.format("[%d/%d]%n", dividende, diviseur);
		System.out.println(str);
		
		System.out.println(Math.PI);
		
		//Arondir la valeur de PI avec deux chiffres apr�s la virgule 
		System.out.printf("%.2f%n", Math.PI);
		
		
		
		
		
		
		
	}

}
