package nLayaredDemo;

import nLayaredDemo.business.abstracts.ProductService;
import nLayaredDemo.business.concretes.ProductManager;
import nLayaredDemo.core.jLoggerManagerAdapter;
import nLayaredDemo.dataAccess.concretes.AbcProductDao;
import nLayaredDemo.dataAccess.concretes.HibernateProductDao;
import nLayaredDemo.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		
		//ToDo: Spring IoC ile çözülecek
		ProductService productService = new ProductManager(new AbcProductDao()
				,new jLoggerManagerAdapter());
		
		Product product = new Product(1,2,"Elma",12,50);
		productService.add(product);
	}

}
