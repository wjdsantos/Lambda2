package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		// Expressao lambda inline
		double min = 100.0;

		//Predicate<Product> pred = p -> p.getPrice() >= min; 
															
		list.removeIf(p -> p.getPrice() >= min); //Em vez de criar uma variavel para passar como argumento
						 			   			 // pego a expressao lambda e coloco como argumento diretamente

		for (Product p : list) {
			System.out.println(p);
		}
	}

}
