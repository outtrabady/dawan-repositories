package fr.dawan.variables;

public class VariablesEtType {

	public static void main(String[] args) {
		
		/*
		 * Declaration d'une variable :   Type nom_variable = valeur;
		 */
		
		//Type caractère 
		char c = 'a';
		System.out.println(c);	
		
		//Type entier: byte, short, int, long 
		byte b = 1;
		short s = 2;
		int i = 3; 
		long l = 4;
		
		/*
		 * On peut forcer une valeur litteral à être interprétée comme un entier long 
		 * en suffixant la valeur par L ou l
		 */
		long l2 = 100L;
		
		/*
		 * Pour plus de visibilité, il est egalement possible de separer les milliers 
		 * par un underscore()
		 */
		long l3 = 1_000_000_000;
		System.out.println("Le contenu de l3 : " + l3);
		
		
		//Les types à virgules flottante : float et double 
		double d1 = 5.8;
		System.out.println("Le contenu de d1 : " + d1);
		
		//Pour les variablEs de type float, il faut suffixer la valeur par F ou f
		float f = 0.5F;
		
		boolean bool = true;
		
		//Type complexe 
		String str = "Dawan"; 
		int[] tab = {200, 300, 50};
		
	}

}
