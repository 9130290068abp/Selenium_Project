package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import BusinessLab.Operations;
import framework.ExecutionDriver;

public class AdditionTest extends ExecutionDriver {
	
	 Operations operation;
	   
		public void init(){ operation = new Operations(driver); }
		  
		public void close(){ operation = null; }
		 	
		
		@Test (priority = 1)
		public void positiveTest() {
			String actualResult = operation.add(15, 15);
			if (actualResult.equals(" 30")) {	
			}else {
				Assert.assertEquals(true, false);
			}
		}

		@Test (priority = 2)
		public void negativeTest() {
			String actualResult = operation.add(15, 5);
			if (actualResult.equals(" 20")) {	
			}else {
				Assert.assertEquals(true, false);
			}
		}
		
		@Test (priority = 3)
		public void decimalTest() {
			String actualResult = operation.add(5.5, 7.5);
			if (actualResult.equals(" 13")) {	
			}else {
				Assert.assertEquals(true, false);
			}
		}
		
		@Test (priority = 4)
		public void positiveNegativeTest() {
			String actualResult = operation.add(-5, 10);
			if (actualResult.equals(" 5")) {	
			}else {
				Assert.assertEquals(true, false);
			}
		}
		
		@Test (priority = 5)
		public void negativeDecimalTest() {
			String actualResult = operation.add(-25, 10.5);
			if (actualResult.equals(" -14.5")) {	
			}else {
				Assert.assertEquals(true, false);
			}
		}
	}
	
