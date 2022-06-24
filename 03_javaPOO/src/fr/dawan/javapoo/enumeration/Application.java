package fr.dawan.javapoo.enumeration;

public class Application {

	public static void main(String[] args) {
		
		Utilisateur user3 = new Utilisateur("Rudd", "Emily", 27);
		
		if(user3.getTypeUtilisateur() == TypeUtilisateur.CLIENT) {
			//recuperer un produit, ou la liste des produits
			System.out.println("Je suis un client");
		} else if (user3.getTypeUtilisateur() == TypeUtilisateur.ADMIN) {
			//Effacer/Modifier/mettre à jours un produit 
			System.out.println("je suis un ADMIN");
		} else if (user3.getTypeUtilisateur() == TypeUtilisateur.PRESTATAIRE) {
			//Effacer/Modifier/mettre à jours un produit 
			System.out.println("je suis un prestataire");
		} else {
			System.out.println("Identifiez vous!!");
		}
		
	}

}
