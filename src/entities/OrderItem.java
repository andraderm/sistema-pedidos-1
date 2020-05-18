package entities;

public class OrderItem {
	
	private Integer quantity;
	private Double price;
	
	private Product product;
	
	public OrderItem() {
	}

	public OrderItem(Integer quantity, Product product) {
		this.quantity = quantity;
		this.product = product;
		price = product.getPrice();
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}
		
	public double subTotal() {
		return quantity * price;
	}
	
	public String getProductName() {
		return product.getName();
	}
	
	public Double getProductPrice() {
		return product.getPrice();
	}

}
