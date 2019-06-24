package hu.flod.menza.model;

public class ProductsModel {
	
	private int id;
	private String productName;
	private int productPrice;
	
	public ProductsModel() {
		
	}
	
	public ProductsModel(int id, String productName, int productPrice) {
		this.id = id;
		this.productName = productName;
		this.productPrice = productPrice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	
	

	
	
}
