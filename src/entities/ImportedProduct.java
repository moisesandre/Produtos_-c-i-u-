package entities;

public class ImportedProduct extends Product {

	private Double costumsFee;

	public ImportedProduct() {
		super();
	}

	public ImportedProduct(String name, Double price, Double costumsFee) {
		super(name, price);
		this.costumsFee = costumsFee;
	}

	public Double getCostumsFee() {
		return costumsFee;
	}

	public void setCostumsFee(Double costumsFee) {
		this.costumsFee = costumsFee;
	}
	
	public Double total() {
		return super.getPrice() + costumsFee;
	}

	@Override
	public String toString() {
		return super.getName() +
	           " $ " +
			   String.format("%.2f", total()) +
			   " (Costums fee: " +
			   costumsFee +
			   ")";
	}
	
}
