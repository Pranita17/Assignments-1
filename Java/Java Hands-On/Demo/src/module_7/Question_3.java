package module_7;
import java.util.Scanner;

class Product1 { 
	
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
	public Product1(Long id, String productName, String supplierName) {
		this.id = id;
		this.productName = productName;
		this.supplierName = supplierName;
	}
	
	Product1() {
		this.id = (long) 0;
		this.productName = "default";
		this.supplierName = "default";
	}
	
	 public String toString(){//overriding the toString() method  
		  return id+":"+productName+":"+supplierName;  
		 }  
}


public class Question_3 {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter product id");
		long id = scan.nextLong();
		scan.nextLine();
		System.out.println("Enter product name ");
		String product = scan.nextLine();
		System.out.println("Enter supplier name");
		String supplier =scan.nextLine();
		Product1 p1 = new Product1(id, product, supplier);
		System.out.println(p1);
		System.out.println("Invoking getClass() method :"+p1.getClass());
	}

}



