package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import BusinessLab.Operations;
import framework.ExecutionDriver;

public class MultiplyTest extends ExecutionDriver {
	
	 Operations operation;
	   
		public void init(){ operation = new Operations(driver); }
		  
		public void close(){ operation = null; }
		
	public void positiveTest() {
		String actualResult = operation.multiply(15, 5);
		if (actualResult.equals(" 75")) {	
		}else {
			Assert.assertEquals(true, false);
		}
	}

	@Test (priority = 2)
	public void negativeTest() {
		String actualResult = operation.multiply(-15, 3);
		if (actualResult.equals(" 45")) {	
		}else {
			Assert.assertEquals(true, false);
		}
	}
	
	@Test (priority = 3)
	public void decimalTest() {
		String actualResult = operation.multiply(5.5, 7.5);
		if (actualResult.equals(" 41.25")) {	
		}else {
			Assert.assertEquals(true, false);
		}
	}
	
	@Test (priority = 4)
	public void positiveNegativeTest() {
		String actualResult = operation.multiply(-5, 10);
		if (actualResult.equals(" -50")) {	
		}else {
			Assert.assertEquals(true, false);
		}
	}
	
	@Test (priority = 5)
	public void negativeDecimalTest() {
		String actualResult = operation.multiply(-2, 10.5);
		if (actualResult.equals(" -21")) {	
		}else {
			Assert.assertEquals(true, false);
		}
	}
}
	


