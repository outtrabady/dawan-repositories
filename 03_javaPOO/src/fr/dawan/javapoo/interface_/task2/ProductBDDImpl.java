package fr.dawan.javapoo.interface_.task2;

import java.util.List;

/*
 * v2.0
 */
public class ProductBDDImpl implements IProductDAO{

	@Override
	public void addProduct(Product p) {
		//SQL - Requ�te d'insertion
	}

	@Override
	public void deleteProductById(int id) {
		//Requete de suppression 
	}

	@Override
	public void updateProduct(Product p) {
		// Requ�te de mise � jour 
		
	}

	@Override
	public List<Product> findAll() {
		// Requ�te de selection
		return null;
	}
	
}
