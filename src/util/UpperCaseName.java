package util;

import java.util.function.Function;

import entities.Product;

//function tem 2 argumentos, o de entrada e o de saída
//nosso argumento de entrada é o Product, e queremos o transformar em upperCase, entrao a saída é uma String
public class UpperCaseName implements Function<Product, String>{

	@Override
	public String apply(Product p) {
		return p.getName().toUpperCase();
	}

}
