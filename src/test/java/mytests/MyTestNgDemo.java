package mytests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MyTestNgDemo {
	WebDriver driver;

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("beforeSuite");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("beforeTest");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("afterTest");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("beforeClass");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("afterClass");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("afterSuite");
	}

	@BeforeMethod
	public void beforeMethod() {
		/*
		 * System.setProperty(
		 * "webdriver.driver.chrome","C:\\Users\\DELL\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe"
		 * ); driver=new ChromeDriver();
		 */
		System.out.println("beforeMethod");
	}

	@AfterMethod
	public void afterMethod() {
		// driver.quit();
		System.out.println("afterMethod");
	}
	/*
	 * @Test(groups = {"SmokeTest","Regression"}) public void testCase1() {
	 * driver.get("https://www.facebook.com/"); System.out.println("testCase1"); }
	 */

	/*
	 * @Test(dependsOnMethods = "testCase1") public void testCase2() {
	 * System.out.println("testCase2"); }
	 */

	@Test(dataProvider = "myDataProvider")
	public void testCase3(String obj1, String obj2) {
		System.out.println("testCase3");
		System.out.println(obj1 + " " + obj2);
	}

	@DataProvider(name = "myDataProvider")
	public Object[][] dataProvider() {
		return new Object[][] { { "Test", "123455" }, { "QA", "124512" } };

	}

}
