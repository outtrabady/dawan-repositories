package fr.dawan.javapoo.constructeur;

public class Utilisateur {

	//Visibilité : public
	//Variable d'instance : Instance.Variable
	public String nom;  //valeur par defaut ==> null
	public String prenom;  //valeur par defaut ==> null
	public int age;      //valeur par defaut ==> 0
	
	//Variable de classe  : Classe.Variable
	public static int nbreUtilisateur;
	
	//Constructeur par defaut (sans paramètre)
	public Utilisateur() {
		nbreUtilisateur++;
	}
	
	//Constructeur avec deux paramètres (nom et prenom)
	public Utilisateur(String nom, String prenom) {
		/*
		 * This fait reference à l'objet courant (en cours) 
		 * This represente l'objet dans lequel nous nous trouvons 
		 * On peut faire appel ç this pour acceder à un attribut de 
		 * la même classe
		 */
		this();
		this.nom = nom;
		this.prenom = prenom;
		//nbreUtilisateur++;
	}
	
	
	//Constructeur avec trois paramètres 
	public Utilisateur(String nom, String prenom, int age) {
//		this.nom = nom; 
//		this.prenom = prenom;
		/*
		 * Un constructeur peut appeler un autre constructeur de la même classe
		 * en utilisant la méthode this()
		 */
		this(nom, prenom);
		this.age = age;
	}
	
	
	
}
