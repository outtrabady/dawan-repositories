package fr.dawan.javapoo.abstraction;

public class Carre extends Forme{
	
	protected int cote = 4;
	protected int prop1 = 20;
	
	
	/*
	 * Pour appeler le constructeur  de la classe parente, il faut utilise mot clé 
	 * super()
	 */
//	public Carre() {
//		super();  //appelle le constructeur sans paramètre de la classe parente
//		System.out.println("Je suis dans la classe carre");
//	}
//	
	
	//Appelle du constructeur avec paramètre de la classe parente
//	public Carre() {
//		super("Constructeur de la classe parente avec paramètre");
//		System.out.println("je suis dans la classe carre");
//	}
	


	/*
	 * Le mot clé super permet d'appeler des méthodes et des attribut de la classe mère
	 */
	public Carre() {
		super();
		System.out.println(super.prop1 + this.prop1);
	}

	

	@Override
	public double aire() {
		return cote*cote;
	}



	@Override
	public String decrisToi() {
		return "Je suis la classe Carre";
	}
	
	
	
}
