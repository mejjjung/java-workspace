package ch04;

public class BuyDTO {
	String username;
	String prodname;
	int price;
	int amount;
	
	public BuyDTO(String username, String prodname, int price, int amount) {
		super();
		this.username = username;
		this.prodname = prodname;
		this.price = price;
		this.amount = amount;
	}

	public String getUsername() {
		return username;
	}

	public String getProdname() {
		return prodname;
	}

	public int getPrice() {
		return price;
	}

	public int getAmount() {
		return amount;
	}
	
	
	
	
	
	
}
