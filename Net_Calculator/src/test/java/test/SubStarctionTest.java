package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import BusinessLab.Operations;
import framework.ExecutionDriver;

public class SubStarctionTest extends ExecutionDriver {
	
	Operations operation;
	   
	public void init(){ operation = new Operations(driver); }
	  
	public void close(){ operation = null; }
	
	public void positiveTest() {
		String actualResult = operation.minus(15, 15);
		if (actualResult.equals(" 0")) {	
		}else {
			Assert.assertEquals(true, false);
		}
	}

	@Test (priority = 2)
	public void negativeTest() {
		String actualResult = operation.minus(15, 5);
		if (actualResult.equals(" 10")) {	
		}else {
			Assert.assertEquals(true, false);
		}
	}
	
	@Test (priority = 3)
	public void decimalTest() {
		String actualResult = operation.minus(5.5, 7.5);
		if (actualResult.equals(" 2")) {	
		}else {
			Assert.assertEquals(true, false);
		}
	}
	
	@Test (priority = 4)
	public void positiveNegativeTest() {
		String actualResult = operation.minus(-5, 10);
		if (actualResult.equals(" 5")) {	
		}else {
			Assert.assertEquals(true, false);
		}
	}
	
	@Test (priority = 5)
	public void negativeDecimalTest() {
		String actualResult = operation.minus(25, -10.5);
		if (actualResult.equals(" -14.5")) {	
		}else {
			Assert.assertEquals(true, false);
		}
	}
}
	
