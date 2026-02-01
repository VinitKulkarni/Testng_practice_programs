
package attributes.annot.xml.study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestClass2 {
	WebDriver driver;
	
	@BeforeSuite
	public void beforeSuiteRegistrationTest() {
		System.out.println("before suite Registration Test");
	}
	
	@BeforeClass
	public void beforeClassRegistrationTest() {
		System.out.println("before class Registration Test");
	}
	
	@BeforeMethod
	public void beforeMethodRegistrationTest() {
		System.out.println("before method Registration Test");
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
		driver.get("https://google.com");
		System.out.println("test case1 Registration Test - smoke:" +bname);
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
    driver.get("https://facebook.com");
		System.out.println("test case2 Registration Test - sanity:" +bname);
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
		driver.get("https://youtube.com");
		System.out.println("test case3 Registration Test - regression:" + bname);
		driver.quit();
	}
}
