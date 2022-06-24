package fr.dawan.javapoo.interface_.task2;

public class Main {

	public static void main(String[] args) {
		IProductDAO dao = new ProductBDDImpl();
		dao.addProduct(new Product());
	}

}
