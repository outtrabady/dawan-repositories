package fr.dawan.condition;

import java.util.Scanner;

public class InstructionSwitch {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int jours = 6;
		
		System.out.print("Saisir le numero du jour : ");
		jours = input.nextInt();
		
		
//		if(jours == 1) {
//			System.out.println("Lundi");
//		}else if(jours == 2) {
//			System.out.println("Mardi");
//		} else if(jours == 3) {
//			System.out.println("Mercredi");
//		} else if(jours == 4) {
//			System.out.println("Jeudi");
//		} else if(jours == 5) {
//			System.out.println("Vendredi");
//		} else if(jours == 6) {
//			System.out.println("Samedi");
//		} else if(jours == 7) {
//			System.out.println("Dimanche");
//		}else {
//			System.out.println("Entrée invalide : Veuillez saisir le numero de jours"
//					+ " entre 1 et 7");
//		}
		
		
		/*
		 * L'instruction Switch est une variante du If-Else
		 * 
		 * Avec le switch au lieu d'évaleur chaque condition 
		 * sequentiellement, il suffit de rechercher un fois 
		 * l'expression et de passer directement à la condition vraie
		 * 
		 * Pour une question de rapidité et de performance le switch est 
		 * préféré
		 * 
		 * Le switch peut être utilisé lorsqu'on a des conditions 
		 * à la carte
		 * 
		 */
		switch(jours) {
			case 1:
				System.out.println("Lundi");
				break;
			case 2: 
				System.out.println("Mardi");
				break;
			case 3: 
				System.out.println("Mercredi");
				break;
			case 4: 
				System.out.println("Jeudi");
				break;
			case 5: 
				System.out.println("Vendredi");
				break;
			case 6:
				System.out.println("Samedi");
				break;
			case 7: 
				System.out.println("Dimanche");
				break;
			default: 
				System.out.println("Entrée invalid : Veuillez saisir un numero"
						+ " entre 1 et 7");
		}
		
		
	}

}
