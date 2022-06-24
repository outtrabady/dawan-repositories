package fr.dawan.javapoo.constructeur;

public class Utilisateur {

	//Visibilit� : public
	//Variable d'instance : Instance.Variable
	public String nom;  //valeur par defaut ==> null
	public String prenom;  //valeur par defaut ==> null
	public int age;      //valeur par defaut ==> 0
	
	//Variable de classe  : Classe.Variable
	public static int nbreUtilisateur;
	
	//Constructeur par defaut (sans param�tre)
	public Utilisateur() {
		nbreUtilisateur++;
	}
	
	//Constructeur avec deux param�tres (nom et prenom)
	public Utilisateur(String nom, String prenom) {
		/*
		 * This fait reference � l'objet courant (en cours) 
		 * This represente l'objet dans lequel nous nous trouvons 
		 * On peut faire appel � this pour acceder � un attribut de 
		 * la m�me classe
		 */
		this();
		this.nom = nom;
		this.prenom = prenom;
		//nbreUtilisateur++;
	}
	
	
	//Constructeur avec trois param�tres 
	public Utilisateur(String nom, String prenom, int age) {
//		this.nom = nom; 
//		this.prenom = prenom;
		/*
		 * Un constructeur peut appeler un autre constructeur de la m�me classe
		 * en utilisant la m�thode this()
		 */
		this(nom, prenom);
		this.age = age;
	}
	
	
	
}
