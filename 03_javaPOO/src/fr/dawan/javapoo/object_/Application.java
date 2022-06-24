package fr.dawan.javapoo.object_;

public class Application {

	public static void main(String[] args) {
		
		CompteBancaire cb1 = new CompteBancaire("Toto", "14dfdf78", 2541000);
		System.out.println(cb1.toString());
		
		CompteBancaire cb2 = new CompteBancaire("Pierre", "77ddffdf999", 5000);
		CompteBancaire cb3 = new CompteBancaire("Pierre", "77ddffdf999", 5000);
		
		//cb2 == cb3   ==> L'operateur == utilisé entre les objets compare l'adresse des references
		System.out.println("L'utilisation de l'operation == " + (cb2 == cb3));
		
		System.out.println(cb2.equals(cb3));
		
	}

}
