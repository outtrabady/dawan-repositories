package fr.dawan.tableaux.tableauxStatique;

public class TableauxMultidimensionnelIteration {

	public static void main(String[] args) {
		
		int[][] scores = {
							{5, 25, 72, 16, 38},      // ligne 1 (indice 0)
							{90, 7, 30},              //ligne 2 (indice 1)
							{37, 97, 1, 52}           //ligne 2 (indice 2)
						};
		
		
		//Premiere boucle for  qui parcours  les lignes 
		for(int i = 0; i < scores.length; i++) {
			//Deuxième boucle for parcours les colonnes de la ligne en cours
			for(int j = 0; j < scores[i].length; j++) {
				System.out.print(scores[i][j] + " ");
			}
			System.out.println();  //saut de ligne
		}
	}

}
