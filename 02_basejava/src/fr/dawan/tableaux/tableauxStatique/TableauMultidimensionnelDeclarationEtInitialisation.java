package fr.dawan.tableaux.tableauxStatique;

public class TableauMultidimensionnelDeclarationEtInitialisation {

	public static void main(String[] args) {

		
		/*
		 * joueur 1:  [10, 20, 30]   --------------- ligne1    (indice 0)
		 * joueur 2 : [55, 15, 80]   --------------  ligne 2   (indice 1)
		 * joueur 3 : [17, 67, 98]   --------------- ligne 3  (indice 2)
		 */
		
		//Création d'un tableau à deux dimensions
		int[][] scores1 = {{10, 20, 30},{55, 15, 80},{17, 67, 98}};
		int[][] scores2 = new int[3][3];
		
		System.out.println(scores1[0][2]);
		System.out.println(scores1[1][1]);
	}

}
