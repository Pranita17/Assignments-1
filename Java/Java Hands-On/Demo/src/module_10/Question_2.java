package module_10;
import java.util.ArrayList;
import java.util.*;

class Box{
	
	double length;
	double width;
	double height;
	
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	public Box(double length, double width, double height) {
		this.length = length;
		this.width = width;
		this.height = height;
	}

	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(this.getVolume());
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Box other = (Box) obj;
		if (Double.doubleToLongBits(this.getVolume()) != Double.doubleToLongBits(other.getVolume()))
			return false;
		return true;
	}
	public String toString() {
		return "Length=" + length + ", Width=" + width + ", Height=" + height + " Volume=" + this.getVolume();
	}

	double getVolume()
	{
		return length*width*height;
	}
	
}


public class Question_2 {

	public static void main(String[] args) {
		
		Set<Box> boxlist = new HashSet<Box>();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the numbers of boxes");
		int x = scan.nextInt();
		scan.nextLine();
		
		for(int i = 0; i < x; i++)
		{
			System.out.println("Enter box "+(i+1)+" details");
			System.out.println("Enter Length");
			double length =scan.nextDouble();
			System.out.println("Enter Width");
		    double width =scan.nextDouble();
			System.out.println("Enter Height");
		    double height = scan.nextDouble();
		    
		    boxlist.add(new Box(length, width, height));
		}    

		System.out.println("Unique boxes in the set are");
		for(Box b: boxlist)
		{
			System.out.println(b);
		}
		
	}

}
