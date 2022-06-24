package fr.dawan.entree_sortie_standard;

public class Exo1 {

	public static void main(String[] args) {
		/*Exos : Afficher [5.7/10] avec les trois methodes  
		 */
		
		//1-Déclaration des variables 
		double d1 = 5.7;
		int val = 10;
		
		//1er méthode: utilisation System.out.println
		System.out.println("[" + d1 + "/" + val + "]");
		
		//2ème méthode: utilisation de printf (solution de piya)
		System.out.printf("[%s/%s]%n", d1, val);
		//Solution de Raphael 
		System.out.printf("[%.1f/%d]%n", d1, val);
		
		//3ème solution : utilisation de String.format
		String str = String.format("[%.1f/%d]%n", d1, val);
		System.out.println(str);		
	}

}
