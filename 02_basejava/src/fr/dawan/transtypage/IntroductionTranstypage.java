package fr.dawan.transtypage;

public class IntroductionTranstypage {
	
	public static void main(String[] args) {
		
		int var1 = 4;
		int var2 = 10;
		
		//int quotient = var1 / var2;
		//System.out.println("quotient = " + quotient);
		
		/*
		 * 1er solution remplacer le type quotient par un double
		 */
//		double quotient  = var1 / var2;
//		System.out.println("quotient = " + quotient);
		
		/*
		 * 2�me solution : transformer les entr�es var1 et var2 en type double
		 */
//		double _var1 = 4; 
//		double _var2 = 10;
//		double quotient = _var1 / _var2;
//		System.out.println("quotient = " + quotient);
		
		
		/*
		 * 3�me solution : On veut garder var1 et var2 comme des entiers
		 */
		double quotient = (double) var1 / var2;
		System.out.println("quotient = " + quotient);
	}
	
}
