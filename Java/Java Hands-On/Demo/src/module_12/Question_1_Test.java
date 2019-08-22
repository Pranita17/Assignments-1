package module_12;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;

public class Question_1_Test {
	
	

	/*
	 * @Before public void inputTest() { Scanner sc = new Scanner(System.in);
	 * sellingPrice = sc.nextDouble(); buyingPrice = sc.nextDouble(); }
	 */
	
	@Test
	public void test1() {
		double profit = Question_1.calculateProfit(12,10); // sellingPrice and buyingPrice both > 0, success test case
		assertEquals(2.0, profit ,0.001);
	}
	
	@Test(expected = IllegalArgumentException.class) 
	public void test2() {
		double profit = Question_1.calculateProfit(10, -10); // sellingPrice > 0, buyingPrice < 0, failure test case
		assertEquals(20, profit, 0.001);
		
		
		
	}
	@Test(expected = IllegalArgumentException.class) 
	public void test3() {
		double profit = Question_1.calculateProfit(-10, 10); // sellingPrice < 0, buyingPrice > 0, failure test case
		assertEquals(-20, profit, 0.001);
		
		
		
	}
	@Test(expected = IllegalArgumentException.class) 
	public void test4() {
		double profit = Question_1.calculateProfit(-10, -10); // sellingPrice and buyingPrice < 0, failure test case
		assertEquals(0, profit, 0.001);
		
		
		
	}
	 

}
