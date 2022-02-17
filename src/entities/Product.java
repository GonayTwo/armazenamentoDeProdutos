package entities;

public class Product {
	private String name;
	private Double price;
	
	public Product(String name, Double price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	
	public String priceTag() {
		String text = this.name + " $ "+this.price;
		return text;
	}


	public String getName() {
		return name;
	}


	public Double getPrice() {
		return price;
	}
	
	
	
	
}
