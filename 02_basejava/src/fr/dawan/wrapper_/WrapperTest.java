package fr.dawan.wrapper_;

import java.util.ArrayList;

public class WrapperTest {

	public static void main(String[] args) {
		ArrayList<Integer> listElmt = new ArrayList<Integer>();
		
		//Parser une chaine de caractère en entier 
		String str1 = "20";
		int k = Integer.parseInt(str1);
		System.out.println(k);
		
		//Convertir une chaine caractère en un entier de type wrapper 
		Integer i = Integer.valueOf("210");
		
		//Convertir une chaine de caractère en double de type Wrapper 
		Double d = Double.valueOf("35.45");
		
		//auto-boxing : Convertir les types de données primitifs en leur objet 
		//de classe wrapper 
		int a = 56;
		Integer i1 = a; //auto-boxing
		
		//Utilisation de l'autoboxing  dans les tableau dynamique 
		int a1 = 45; 
		listElmt.add(i1);
		
		//Unboxing : Convertir l'objet de la classe wrapper vers son type primitif
		Integer i2 = 45;
		int a2 = i2;
		
		//Utilisation de l'unboxing dans les tableaux dynamique
		int a3 = listElmt.get(0);
	}

}
