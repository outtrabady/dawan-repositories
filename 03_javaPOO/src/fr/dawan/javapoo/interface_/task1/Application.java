package fr.dawan.javapoo.interface_.task1;

public class Application {

	public static void main(String[] args) {
		
		//Utilisation du polymorphisme 
		Animal animal1 = new Chat();
		Animal animal2 = new Chien();
		
		animal1.communiquer();
		animal2.communiquer();
	}

}
