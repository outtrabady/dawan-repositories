package fr.dawan.javapoo.polymorphisme;

import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) {

		ArrayList<EtreHumain> tabEH = new ArrayList<>();
		tabEH.add(new Femme());
		tabEH.add(new Homme());
		tabEH.add(new Femme());
		tabEH.add(new Homme());
		
		for (EtreHumain etreHumain : tabEH) {
			etreHumain.uriner();
		}
		
		EtreHumain etreHumain = new Femme();
		etreHumain.uriner();
		
		
		
		//Utilisation du polymorphisme 
		//L'interface List reference sa classe fille ArrayList
		List<EtreHumain> listEH = new ArrayList<>();
	
	}

}
