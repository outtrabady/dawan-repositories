package fr.dawan.transtypage;

public class TranstypageImpliciteEtExplicite {

	public static void main(String[] args) {
		
		//Transtypage implicite : Concerne le passage d'un type inferieur 
		//vers un type superieur 
		int i = 42; 
		double d = i;
		
		//Transypage explicite (cast) 
		//Passage d'un type superieur vers un type inferieur, cela 
		//implique de faire un cast 
		//CAST : concerne les conversions de types compatibles
		int i1 = 123; 
		short s = (short) i1;
		
		//Perte de précision
		//byte[-128, +127]
		//-128 -127 -126
		int i3 = 130; 
		byte b = (byte) i3;
		System.out.println(b);
		
		
	}

}
