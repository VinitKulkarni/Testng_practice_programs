
package attributes.annot.xml.study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
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
	@Parameters("browsername")
	public void testcase1(String bname) {
		if(bname.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
    else {
			driver = new FirefoxDriver();
		}
		driver.get("https://amazon.com");
		System.out.println("test case1 login test - smoke:" + bname);
		driver.quit();
	}
	
	@Test(priority = 2, groups = "sanity")
	@Parameters("browsername")
	public void testcase2(String bname) {
		if(bname.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
    else {
			driver = new FirefoxDriver();
		}
		driver.get("https://flipkart.com");
		System.out.println("test case2 login test - sanity:" + bname);
		driver.quit();
	}
	
	@Test(priority = 3, groups = "regression")
	@Parameters("browsername")
	public void testcase3(String bname) {
		if(bname.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
    else {
			driver = new FirefoxDriver();
		}
		driver.get("https://netflix.com");
		System.out.println("test case3 login test - regression:" + bname);
		driver.quit();
	}
}
