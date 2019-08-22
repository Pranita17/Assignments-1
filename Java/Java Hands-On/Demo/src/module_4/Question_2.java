package module_4;

import java.util.Scanner;

class Product{
	
	private long id;
	private String productName;
	private String supplierName;
	public long getId() {
		return id;
	}
	public void setId(long id) {
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
	
	
}



public class Question_2 {

	public static void main(String[] args) {
		Product p= new Product();
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Enter the product id");
		int x=scan.nextInt();
		p.setId(x);

		scan.nextLine();
		System.out.println("Enter the product name");
		String y=scan.nextLine();
		p.setProductName(y);
		
		System.out.println("Enter the supplier name");
		String z=scan.nextLine();
		p.setSupplierName(z);
		
		
		System.out.println("Product Id is "+p.getId());
		System.out.println("Product Name is "+p.getProductName());
		System.out.println("Supplier Name is "+p.getSupplierName());
	}

}
