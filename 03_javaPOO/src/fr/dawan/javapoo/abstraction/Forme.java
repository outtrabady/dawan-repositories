package fr.dawan.javapoo.abstraction;

public abstract class Forme {
	
	protected int prop1 = 5;
	
	private String chaine;
	
	public Forme() {
		System.out.println("Je suis un constructeur de la classe Forme");
	}
	
	public Forme(String chaine) {
		this.chaine = chaine;
		System.out.println(this.chaine);
	}
	
	public String decrisToi() {
		return "je suis la classe abstraite";
	}
	
	public abstract double aire();
	
}
