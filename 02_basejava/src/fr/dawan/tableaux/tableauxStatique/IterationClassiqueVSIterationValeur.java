package fr.dawan.tableaux.tableauxStatique;

/*
 * Nous allons voir les avantages et inconvenients entre l'iteration classique 
 * l'iteration par valeur (foreach) 
 * 
 * Conclusion : Pour modifier une valeur on va utiliser l'iteration classique
 */
public class IterationClassiqueVSIterationValeur {

	public static void main(String[] args) {
		
		int[] tab = {200, 330, 50};
		
		System.out.println("***********Iteration classique avec la boucle for***********");
		
		//La taille du tableau 
		System.out.println("Taille du tableau : " + tab.length);
		
		for(int i = 0; i < tab.length; i++) {
			System.out.println(tab[i]);
			//tab[i] = 22;
		}
		
		//System.out.println("tab[2] : " + tab[1]);
		
		System.out.println("\n Iteration par valeur avec la boucle FOREACH******");
		for(int element: tab) {
			System.out.println(element);
			//element = 22;
		}
		 
		
		System.out.println("tab[2] : " + tab[2]);
	}

}
