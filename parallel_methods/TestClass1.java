package attributes.annot.xml.study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestClass1 {
	WebDriver driver;
	
	@BeforeSuite
	public void beforeSuiteLoginTest() {
		System.out.println("before suite login test");
	}
	
	@BeforeClass
	public void beforeClassLoginTest() {
		System.out.println("before class login test");
	}
	
	@BeforeMethod
	public void beforeMethodLoginTest() {
		System.out.println("before method login test");
	}
	
	@Test(priority = 1, groups = "smoke")
	public void testcase1() {
		driver = new ChromeDriver();
		driver.get("https://amazon.com");
		System.out.println("test case1 login test - smoke");
		driver.quit();
	}
	
	@Test(priority = 2, groups = "sanity")
	public void testcase2() {
		driver = new ChromeDriver();
		driver.get("https://flipkart.com");
		System.out.println("test case2 login test - sanity");
		driver.quit();
	}
	
	@Test(priority = 3, groups = "regression")
	public void testcase3() {
		driver = new ChromeDriver();
		driver.get("https://netflix.com");
		System.out.println("test case3 login test - regression");
		driver.quit();
	}
}
