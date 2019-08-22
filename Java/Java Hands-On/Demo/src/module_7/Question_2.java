package module_7;
import java.util.Scanner;

class Product { 
	
	private Long id;
	private String productName;
	private String supplierName;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getSupplierName() {
		return supplierName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	public Product(Long id, String productName, String supplierName) {
		this.id = id;
		this.productName = productName;
		this.supplierName = supplierName;
	}
	
	Product() {
		this.id = (long) 0;
		this.productName = "default";
		this.supplierName = "default";
	}
	
	void display() {
		System.out.println("Product Id is " + id + "\nProduct Name is "+ productName+"\nSupplier Name is "+supplierName);

	}
	
	
	 boolean equals(Product p2) {
		if((this.getId()==p2.getId())&&(this.getProductName().equals(p2.getProductName()))&&(this.getSupplierName().equals(p2.getSupplierName()))) {
			return true;
		}
		return false;
	}
}


public class Question_2 {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter product id");
		long id = scan.nextLong();
		scan.nextLine();
		System.out.println("Enter product name ");
		String product = scan.nextLine();
		System.out.println("Enter supplier name");
		String supplier =scan.nextLine();
		Product p1 = new Product(id, product, supplier);
		
		System.out.println("Enter product id");
		long id1 = scan.nextLong();
		scan.nextLine();
		System.out.println("Enter product name ");
		String product1 = scan.nextLine();
		System.out.println("Enter supplier name");
		String supplier1 =scan.nextLine();
		Product p2 = new Product(id1, product1, supplier1);
		
		if(p1.equals(p2)) {
			System.out.println("The two products are the same");
		}
		else {
			System.out.println("The two products are different");
		}
		
	}

}
