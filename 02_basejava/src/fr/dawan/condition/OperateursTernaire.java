package fr.dawan.condition;

public class OperateursTernaire {

	public static void main(String[] args) {
		int nbre = 10; 
		String str = "";
		
		
		/*
		 * Instruction If-Else 
		 */
//		if(nbre > 0) {
//			str = "Positif";
//		} else {
//			str = "Négatif";
//		}
		
		
		/*
		 * Operateur Ternaire 
		 * Syntaxe  ==> Condition ? instruction1 : instruction2
		 */
		str = (nbre > 0) ? "Positif" : "Négatif";
	}

}
