package module_13;

import java.util.*;


class Employee{
	int id;
	String name;
	int age;
	double salary;
	
	
	public Employee(int id, String name, int age, double salary) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
}



public class Question_3 {

	public static void main(String[] args) {
		Employee employee1 = new Employee(1, "John", 25, 100000.00); 
		Employee employee2 = new Employee(2, "Jack", 22, 90000.00); 
		Employee employee3 = new Employee(3, "Laura", 38, 120000.00); 
		Employee employee4 = new Employee(4, "Smith", 28, 90000.00); 

		List<Employee> employees = new ArrayList<>(); 
		employees.add(employee1); 
		employees.add(employee2); 
		employees.add(employee3); 
		employees.add(employee4);
		
		 employees.stream()  
         .filter(p ->p.age< 30)   // filtering price  
         .map(pm ->pm.age)          // fetching price
         .forEach(System.out::println);  // iterating price  
		
	}

}
