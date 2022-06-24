package fr.dawan.javapoo.abstraction;

public class Carre extends Forme{
	
	protected int cote = 4;
	protected int prop1 = 20;
	
	
	/*
	 * Pour appeler le constructeur  de la classe parente, il faut utilise mot cl� 
	 * super()
	 */
//	public Carre() {
//		super();  //appelle le constructeur sans param�tre de la classe parente
//		System.out.println("Je suis dans la classe carre");
//	}
//	
	
	//Appelle du constructeur avec param�tre de la classe parente
//	public Carre() {
//		super("Constructeur de la classe parente avec param�tre");
//		System.out.println("je suis dans la classe carre");
//	}
	


	/*
	 * Le mot cl� super permet d'appeler des m�thodes et des attribut de la classe m�re
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
