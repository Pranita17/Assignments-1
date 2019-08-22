package module_5;

import java.util.*;

class Shape
{
	protected String shapeName;
	
	Shape(String shapeName)
	{
		this.shapeName=shapeName;
	}
	
	Double calculateArea()
	{
		return (double) 0;
	}
}


class Circle extends Shape
{
	Integer radius;
	
	Circle(Integer radius)
	{
		super("Circle");
		this.radius = radius;
	}
	
	Double calculateArea()
	{
		double area =(double)radius*radius*3.1416;
		return area;
	}
	
}

class Square extends Shape
{
	Integer side;
	
	Square(Integer side)
	{
		super("Square");
		this.side = side;
	}
	
	Double calculateArea()
	{
		double area = (double)side*side;	
		return area;
	}
}

class Rectangle extends Shape
{
	Integer length, breadth;
	
	
	Rectangle(Integer length, Integer breadth)
	{
		super("Rectangle");
		this.length=length;
		this.breadth=breadth;
	}
	
	Double calculateArea()
	{
		Double area = (double) (length*breadth);
		return area; 
	}
}


public class Question_2 {

	public static void main(String[] args) {
		
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("1.Rectangle"+"\n"+"2.Square"+"\n"+"3.Circle");
		System.out.println("Area Calculator --- Choose your shape");
		int choose = sc.nextInt();
		
		switch(choose)
		{
		case 1:	System.out.println("Enter length and breadth: ");
				int l = sc.nextInt();
				int b = sc.nextInt();
				Rectangle r1= new Rectangle(l,b);
				System.out.printf("Area of the Rectangle is: %.02f",r1.calculateArea());
				break;
			
		case 2:	System.out.println("Enter side:");
				int s = sc.nextInt();
				Square s1= new Square(s);
				System.out.printf("Area of the Square is: %.02f",s1.calculateArea());
				break;
			
		case 3: System.out.println("Enter Radius: ");
				int r = sc.nextInt();
				Circle c1= new Circle(r);
				System.out.printf("Area of the Circle is: %.02f ",c1.calculateArea());
				
				break;
		
		default:System.out.println("Enter the appropriate number next time !");
				break;
		
		}
	}

}
