package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import BusinessLab.Operations;
import framework.ExecutionDriver;

public class DivideTest extends ExecutionDriver{
	
	Operations operation;
	   
	public void init(){ operation = new Operations(driver); }
	  
	public void close(){ operation = null; }
	
	public void positiveTest() {
		String actualResult = operation.divide(15, 5);
		if (actualResult.equals(" 3")) {	
		}else {
			Assert.assertEquals(true, false);
		}
	}

	@Test (priority = 2)
	public void negativeTest() {
		String actualResult = operation.divide(-15, -5);
		if (actualResult.equals(" 3")) {	
		}else {
			Assert.assertEquals(true, false);
		}
	}
	
	@Test (priority = 3)
	public void decimalTest() {
		String actualResult = operation.divide(5.5, 2.5);
		if (actualResult.equals(" 2.2")) {	
		}else {
			Assert.assertEquals(true, false);
		}
	}
	
	@Test (priority = 4)
	public void positiveNegativeTest() {
		String actualResult = operation.divide(-50, 10);
		if (actualResult.equals(" -5")) {	
		}else {
			Assert.assertEquals(true, false);
		}
	}
	
	@Test (priority = 5)
	public void negativeDecimalTest() {
		String actualResult = operation.divide(-25, 12.5);
		if (actualResult.equals(" -2")) {	
		}else {
			Assert.assertEquals(true, false);
		}
	}
}
	

