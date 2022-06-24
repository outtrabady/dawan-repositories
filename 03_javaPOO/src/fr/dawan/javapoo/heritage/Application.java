package fr.dawan.javapoo.heritage;

public class Application {

	public static void main(String[] args) {
		Client client = new Client(); 
		
		
		client.nom = "Toto";
		
		System.out.println(client.nom);
		
		client.setAge(19);
		System.out.println(client.getAge());
		
		System.out.println(client.decrisToi());
		
		
		
	}

}
