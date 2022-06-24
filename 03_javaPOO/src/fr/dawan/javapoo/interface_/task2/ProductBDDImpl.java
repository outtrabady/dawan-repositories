package fr.dawan.javapoo.interface_.task2;

import java.util.List;

/*
 * v2.0
 */
public class ProductBDDImpl implements IProductDAO{

	@Override
	public void addProduct(Product p) {
		//SQL - Requête d'insertion
	}

	@Override
	public void deleteProductById(int id) {
		//Requete de suppression 
	}

	@Override
	public void updateProduct(Product p) {
		// Requête de mise à jour 
		
	}

	@Override
	public List<Product> findAll() {
		// Requête de selection
		return null;
	}
	
}
