package fr.dawan.operateurs;

public class Operateurs {

	public static void main(String[] args) {
		
		System.out.println("************Operateurs d'affectation****************");
		int a = 10;
		
		a += 5; //a = a+5;
		a -= 5; //a = a-5;
		a *= 5; //a = a*5;
		a /= 5; //a=a/5;
		
		System.out.println("Operateurs d'incrementation et decrementation");
		a++;  //a = a + 1;  ==> Incrementation 
		a--; //a = a - 1;   ==> Décrementation
		
		System.out.println("Operateurs mathematique");
		//Addition, Multiplication, Division, Soustraction, Modulo (%)
		//ex: Modulo
		int var1 = 4; 
		int var2;
		var2 = 10;
		int modulo = var2 % var1;
		System.out.println("result = " + modulo);
		
	}

}
