package fr.dawan.tableaux.tableauxDynamique;

import java.util.ArrayList;

/*
 * L'objectif des tableaux dynamique, dites collection, est de pouvoir 
 * cr�e des tableaux qu'on pourra facilement modifier; la taille peut augmenter 
 * ou diminuer 
 * 
 * Nous allons utiliser la classe ArrayList pour cr�er nos tableaux dynamique : 
 * 		
 * La classe Arraylist est utilis�e pour les types Evolu�s (complexes) 
 * 
 * On peut lui affecter entre chevron le type de donn�es qu'il va stocker
 */
public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList<Integer> tab1 = new ArrayList<Integer>();
		
		//Ajouter un element dans le tableau 
		tab1.add(20);
		
		//On peut modifier un element dans le tableau 
		tab1.set(0, 60);
		System.out.println(tab1.get(0));
		
		tab1.add(500);
		
		tab1.add(240);
		
		System.out.println("Element � la position 2 : " + tab1.get(2));
		
		//Taille du tableau
		System.out.println("Taille avant suppression : " + tab1.size());
		
		//Suppression d'un element 
		tab1.remove(1);
		
		System.out.println("Taille apr�s suppression : " + tab1.size());

		
	}

}
