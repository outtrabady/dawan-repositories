package fr.dawan.javapoo.constructeur;

public class Application {

	public static void main(String[] args) {
		
		//Un objet esr crée avec le mot clé "new + constructeur" 
		//constructeur ==> Utilisateur()
		//Objet : new Utilisateur()
		//user1 contient l'adresse de l'objet
		Utilisateur user1 = new Utilisateur();
		user1.nom = "toto"; 
		user1.prenom = "tata";
		System.out.println("NomUser1 : " + user1.nom);
		
		Utilisateur user2 = new Utilisateur("Dupont", "Pierre");
		System.out.println("NomUser2 : " + user2.nom);
		
		Utilisateur user3 = new Utilisateur("Rudd", "Emily", 27);
		System.out.println("AgeUser3 " + user3.age);
		
		System.out.println("Nombre d'utilisateur : " + Utilisateur.nbreUtilisateur);
		
	}

}
