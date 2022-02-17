package entities;

import java.time.LocalDate;

public class UsedProduct extends Product{
	private LocalDate manufactureDate;

	public UsedProduct(String name, Double price, LocalDate manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}
	
	@Override
	public String priceTag() {
		return super.getName()+" (Used) $ "+super.getPrice()+" (Manufacture date: "
				+this.manufactureDate;
	}
	
}
