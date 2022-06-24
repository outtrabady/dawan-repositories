package fr.dawan.methodes;

/*
 * Methode : Un ensemble d'instruction r�utilisable - eviter de repeter du code 
 * D�clarer une methode : 
 * 		Visibilit�[mot-cl�] type-retour nom-m�thode(param){itructions}
 */
public class Application {

	public static void main(String[] args) {
		int tab[] = {14, 12, 8, 18};
		afficher();
		afficher(tab);
		int res1 = somme(2, 30);
		System.out.println("res1 = " + res1);
		
		System.out.println("res2 = " + somme(tab));
		
		
	}
	
	
	/**
	 * Methode afficher 
	 * void ==> Si aucune valeur n'est retourn�e, on utilise le pseudo-type void
	 */
	public static void afficher() {
		System.out.println("Methode afficher");
	}
	
	/**
	 * Methode afficher 
	 * Affiche les �l�ments d'un tableau
	 * @param tab
	 */
	public static void afficher(int[] tab) {
		for(int item: tab) {
			System.out.print(item + " ");
		}
		System.out.println();
	}
	
	/**
	 * Methode prend deux param�tre int et retourne un entier 
	 * @param val1
	 * @param val2
	 * @return
	 */
	public static int somme(int val1, int val2) {
		int result = 0; 
		result = val1 + val2;
		return  result;
	}
	
	/**
	 * Methode qui renvoie la somme des �l�ments d'un tableau d'entier 
	 * @param tab1
	 * @return
	 */
	public static int somme(int[] tab1) {
		int somme = 0;
		for (int item : tab1) {
			somme += item;  //somme = somme + item;
		}
		return somme;
	}
	
	
	/**
	 * M�thode somme qui retourne un double, et prend en param�tre deux nombres r�el (double)
	 * @param d1
	 * @param d2
	 * @return
	 */
	public static double somme(double d1, double d2) {
		double somme = d1 + d2;
		return somme;
	}
	
	
	public static double somme(double[] tab1) {
		double somme = 0;
		for (double item : tab1) {
			somme += item;  //somme = somme + item;
		}
		return somme;
	}
	
	
	/**
	 * M�thode qui renvoie la moyenne des �l�ments d'un tableau  (double)
	 * @param tab
	 * @return
	 */
	public static double moyenne(double[] tab) {
		double sum = somme(tab);
		double moyenne = sum / tab.length;
		return moyenne;
	}
	
	//[14, 12, 8, 18]
	//M�thode qui retourne l'�l�ment le plus petit d'un tableau (int)
	public static int minTableau(int[] tab) {
		int min = tab[0];
		for (int i = 1; i < tab.length; i++) {
			if(min > tab[i]) {
				min = tab[i];
			}
		}	
		return min;
	}

}
