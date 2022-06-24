package fr.dawan.javapoo.interface_.task2;

import java.util.List;

public interface IProductDAO {
	
	//Liste l'ensemble des fonctionnalités du client 
	void addProduct(Product p);
	void deleteProductById(int id);
	void updateProduct(Product p);
	List<Product> findAll();

}
