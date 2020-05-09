package com.automation.test.learn;

//import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;		
import org.testng.annotations.Test;	
import org.testng.annotations.BeforeTest;	
import org.testng.annotations.AfterTest;		
public class NewTest {		
	    private WebDriver driver;		
		@Test				
		public void test1() {	
 
			String title = driver.getTitle();				 
			Assert.assertTrue(title.contains("Demo Guru99 Page")); 		
		}
		
		@Test				
		public void test2() {	
			
			String title = driver.getTitle();				 
			Assert.assertTrue(title.contains("hdg")); 		
		}
		@BeforeTest
		public void beforeTest() {	
			System.setProperty("webdriver.chrome.driver","E:\\Desktop\\workspace\\learn\\chromedriver.exe");
			driver = new ChromeDriver();  
			driver.get("http://demo.guru99.com/test/guru99home/");  
		}		
		@AfterTest
		public void afterTest() {
			driver.quit();			
		}		
}	
