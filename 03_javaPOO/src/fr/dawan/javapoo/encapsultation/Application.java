package fr.dawan.javapoo.encapsultation;

public class Application {

	public static void main(String[] args) {
		
		Utilisateur user3 = new Utilisateur("Rudd", "Emily", 27);
		System.out.println("AgeUser3 : " + user3.getAge());
		
		user3.setAge(12);
		
		System.out.println("Age Emily : " + user3.getAge() + " ans");
		
		System.out.println("Nombre d'utilisateur : " + Utilisateur.getNbreUtilisateur());
		
		System.out.println(user3.decrisToi());
		
	}

}
