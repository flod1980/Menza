package hu.flod.menza.model;

public class CartModel {

	private int id;
	private int productId;
	private int workerId;
	private String purchaseDate;
	private String productName;
	private int productPrice;
	private int Quantity;
	private int subTotal;
	
	public CartModel() {
		
	}
	
	public CartModel(int id, int productId, int workerId, String purchaseDate, String productName, int productPrice,
			int quantity, int subTotal) {
		this.id = id;
		this.productId = productId;
		this.workerId = workerId;
		this.purchaseDate = purchaseDate;
		this.productName = productName;
		this.productPrice = productPrice;
		Quantity = quantity;
		this.subTotal = subTotal;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getWorkerId() {
		return workerId;
	}

	public void setWorkerId(int workerId) {
		this.workerId = workerId;
	}

	public String getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(String purchaseDate) {
		this.purchaseDate = purchaseDate;
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

	public int getQuantity() {
		return Quantity;
	}

	public void setQuantity(int quantity) {
		Quantity = quantity;
	}

	public int getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(int subTotal) {
		this.subTotal = subTotal;
	}

}
