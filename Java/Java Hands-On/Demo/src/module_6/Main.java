package module_6;
import java.util.Scanner;

class Shape {
	protected String shapeName;
	Shape(String shapeName)
	{
		this.shapeName=shapeName;
	}
	Double calculateArea() {
		return 0.00;
	}
	
}

class Square extends Shape {
	Integer side;
	Square(Integer side)
	{
		super("Square");
		this.side=side;
		
	}
	Double calculateArea ()
	{
		return (double)side*side;
	}
}

class Rectangle extends Shape {
	Integer length, breadth;
	Rectangle(Integer length, Integer breadth)
	{
		super("Rectangle");
		this.length = length;
		this.breadth = breadth;
	}
	Double calculateArea(){
		return (double)length*breadth;
	}
	
}
class Circle extends Shape {
	Integer radius;
	Circle(Integer radius)
	{
		super("Circle");
		this.radius=radius;
		
	}
	Double calculateArea ()
	{
		return (double)(3.1416*radius*radius);
	}
}

class Hexagon extends Shape {
	Integer side;
	Hexagon(Integer side)
	{
		super("Hexagon");
		this.side=side;
	}
	
}

public class Main {

	public static void main(String[] args) {
	
	Scanner read = new Scanner(System.in);
	System.out.println("1. Rectangle\n2. Square\n3. Circle\n4. Hexagon\nArea Calculator --- Choose your shape");
	int choice = read.nextInt();
	if(choice==1)
	{
		System.out.println("Enter length and breadth: ");
		int length=read.nextInt();
		int breadth=read.nextInt();
		Rectangle obj = new Rectangle(length, breadth);
		System.out.println("Area of Rectangle is: "+obj.calculateArea());
		
	}
	else if(choice==2)
	{
		System.out.println("Enter side: ");
		int side=read.nextInt();
		
		Square obj = new Square(side);
		System.out.println("Area of Square is: "+obj.calculateArea());
		
	}
	else if(choice==3)
	{
		System.out.println("Enter radius: ");
		int radius=read.nextInt();
		
		Circle obj = new Circle(radius);
		System.out.println("Area of Circle is: "+obj.calculateArea());
		
	}
	else if(choice==4)
	{
		System.out.println("Enter side: ");
		int side=read.nextInt();
		
		Hexagon obj = new Hexagon(side);
		System.out.println("Area of Hexagon is: "+obj.calculateArea());
		
	}
	else
	{
		System.out.println("Choice between 1 2 3 4 only");
	}
		
	}

}
