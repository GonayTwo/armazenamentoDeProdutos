package application;

import java.util.ArrayList;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import entities.Product;
import entities.UsedProduct;
import entities.ImportedProduct;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Product> products = new ArrayList<Product>();
		
		String productType;
		String name;
		Double price;
		Integer numberOfProducts;
		
		
 		System.out.println("Enter the number of products:");
		numberOfProducts = sc.nextInt();
		
		for(int i=0;i<numberOfProducts;i++) {
			System.out.println("Product #"+(i+1)+" data:");
			System.out.println("Common, Used or Imported (c/u/i)?");
			productType = sc.next();
			System.out.println("Name:");
			name = sc.next();
			System.out.println("Price:");
			price = sc.nextDouble();
						
			switch(productType) {
			case "i":
				Double fee;
				System.out.println("Customs Fee:");
				fee = sc.nextDouble();
				products.add(new ImportedProduct(name,price,fee));		
			break;
			case "c":
				products.add(new Product(name,price));
			break;
			case "u":
				String date;
				System.out.println("Enter the manufacture date: (yyyy-mm-dd)");
				date = sc.next();
				products.add(new UsedProduct(name,price,LocalDate.parse(date)));
			break;
			default:
				System.out.println("This kind of product doesn't exist.");
			break;
			}
		
		
		}
		System.out.println("PRICE TAGS:");
		for(Product p : products) {
			System.out.println(p.priceTag());
		}
	}
}
