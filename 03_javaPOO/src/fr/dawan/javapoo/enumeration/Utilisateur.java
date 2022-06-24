package fr.dawan.javapoo.enumeration;

public class Utilisateur {

	//Visibilit� : public
	//Variable d'instance : Instance.Variable
	private String nom; 
	private String prenom;  
	private int age;     
	
	//Variable de classe  : Classe.Variable
	private static int nbreUtilisateur;
	
	private TypeUtilisateur typeUtilisateur;
	
	//Constructeur par defaut (sans param�tre)
	public Utilisateur() {
		nbreUtilisateur++;
		typeUtilisateur = TypeUtilisateur.CLIENT;
	}
	
	//Constructeur avec deux param�tres (nom et prenom)
	public Utilisateur(String nom, String prenom) {

		this();
		this.nom = nom;
		this.prenom = prenom;
		//nbreUtilisateur++;
	}
	
	
	//Constructeur avec trois param�tres 
	public Utilisateur(String nom, String prenom, int age) {
		this(nom, prenom);
		//this.age = age;
		this.setAge(age);
	}
	
	//GETTER
	public int getAge() {
		return this.age;
	}
	
	//SETTER 
	public void setAge(int age) {
		
		if(age < 15) {
			System.out.println("Interdit au moins de 15 ans ");
		} else {
			this.age = age;
		}
	
	}
	
	
	//GETTER
	public static int getNbreUtilisateur() {
		return nbreUtilisateur;
	}
	
	
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public TypeUtilisateur getTypeUtilisateur() {
		return typeUtilisateur;
	}

	public void setTypeUtilisateur(TypeUtilisateur typeUtilisateur) {
		this.typeUtilisateur = typeUtilisateur;
	}

	public String decrisToi() {
		String str = "Je m'appelle " + this.nom + " " + this.prenom + " et j'ai " + this.age + " ans";
		return str;
	}
	
}