package mytests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNgDemo2 {

	@Test(groups = {"Smoke"})
	public void testCase1() {

		/*
		 * System.setProperty("webdriver.driver.chrome",
		 * "C:\\Users\\DELL\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		 * WebDriver driver = new ChromeDriver();
		 * driver.get("https://www.facebook.com/");
		 * System.out.println(driver.getTitle());
		 */
		System.out.println("Smoke");
		/* Assert.assertEquals(driver.getTitle(), "Facebook – log in or sign up"); */
		
		
	}
	@Test(groups = {"Regression"})
	public void testCase2() {

		/*
		 * System.setProperty("webdriver.driver.chrome",
		 * "C:\\Users\\DELL\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		 * WebDriver driver = new ChromeDriver();
		 * driver.get("https://www.facebook.com/");
		 */
		System.out.println("Regression");
		/*
		 * System.out.println(driver.getTitle());
		 * 
		 * Assert.assertEquals(driver.getTitle(), "Facebook – log in or sign up");
		 */
		
	}
	@Test(groups = {"Smoke"})
	public void testCase3() {

		/*
		 * System.setProperty("webdriver.driver.chrome",
		 * "C:\\Users\\DELL\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		 * WebDriver driver = new ChromeDriver();
		 * driver.get("https://www.facebook.com/");
		 */
		System.out.println("Smoke");
		/*
		 * System.out.println(driver.getTitle());
		 * 
		 * Assert.assertEquals(driver.getTitle(), "Facebook – log in or sign up");
		 */
		
		
	}

}
