package fr.dawan.boucle;

/*
 * L'interet : 
 * 		Le rôle des boucles estde  repeter un certain nombre de fois 
 * 		les mêmes opérations 
 * 
 */
public class BoucleFor {

	public static void main(String[] args) {
		
		/*
		 * Exemple 1 : Utilité des boucles 
		 * On constate que l'écriture est fastidieuse et longue, 
		 * c'est du copier-coller
		 */
//		System.out.println("Le double de 1 est " + 1*2);
//		System.out.println("Le double de 2 est " + 2*2);
//		System.out.println("Le double de 3 est " + 3*2);
//		System.out.println("Le double de 4 est " + 4*2);
//		System.out.println("Le double de 5 est " + 5*2);
//		System.out.println("Le double de 6 est " + 6*2);
//		System.out.println("Le double de 7 est " + 7*2);
//		System.out.println("Le double de 8 est " + 8*2);
//		System.out.println("Le double de 9 est " + 9*2);
//		System.out.println("Le double de 10 est "+ 10*2);
		
		/*
		 * Solution de l'exemple 1 : Utilisation de la boucle FOR
		 * La boucle FOR s'utilise quand on connait le nombre d'itération 
		 * (le nombre de fois qu'on execute une instruction)
		 */
		for(int i = 1; i <= 10; i++) {
			System.out.println("Le nombre de " + i + " est " + i*2);
		}
		
	}

}
