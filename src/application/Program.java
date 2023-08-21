package application;

	
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

import entities.Product;
import util.UpperCaseName;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		//a função "map" é uma função que aplica uma função a todos os elementos de uma stream
		//"map" so funciona para stream e nao para list
		//por isso que aqui primeiro convertemos para stream ( list.stream().map(new UpperCaseName()) ) e depois para list novamente ( .collect(Collectors.toList()); ) 
		//stream - sequencia de dados
		List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
		
		//print
		names.forEach(System.out::println);
	}

}
