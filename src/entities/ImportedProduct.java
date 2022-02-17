package entities;

public class ImportedProduct extends Product{
	private Double customFee;

	public ImportedProduct(String name, Double price, Double customFee) {
		super(name, price);
		this.customFee = customFee;
	}
	
	@Override
	public String priceTag() {
		String text = super.getName()+" $ "+this.totalPrice()+
					  " (Customs Fee: $ "+this.customFee+")";
		return text;
	}
	
	public Double totalPrice() {
		return super.getPrice()+this.customFee;
	}
}
