
public class Product {
	private static int result = 0;
	public int newResult() {
		return result;
	}

	public void setResult(int newResult) {
		this.result = newResult;
	}
	
	private String name;
	public String getName() {
		return name;
	}

	public void setName(String newName) {
		this.name = newName;
	}
	
	private double price;
	public double getPrice() {
		return price;
	}

	public void setPrice(double newPrice) {
		this.price = newPrice;
	}
	
	public Product() {
		result++;
	}
	
	public Product(String newName) {
		result++;
	}
	
	public Product(double newPrice) {
		result++;
	}
	
	public Product(String newName, double newPrice) {
		result++;
	}
	
	public static void main(String[] args) {
		Product p1 = new Product();
		Product p2 = new Product("lol");
		Product p3 = new Product("ddd",33.2);
		Product p4 = new Product(55.6);
        System.out.println(Product.count());
	}
	
	public static int count() {
		return result;
	}

}
