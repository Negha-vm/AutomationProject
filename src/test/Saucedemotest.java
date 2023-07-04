package test;



import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.SaucedemoCartpage;
import page.SaucedemoCheckoutpage;
import page.SaucedemoProductpage;
import page.Saucedemologinpage;


public class Saucedemotest {

	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/");

	}
	@Test
	public void test() throws Exception
	{

		Saucedemologinpage ob=new Saucedemologinpage(driver);
		ob.login();
		SaucedemoProductpage ob1=new SaucedemoProductpage(driver);
		ob1.product();
		SaucedemoCartpage ob2=new SaucedemoCartpage(driver);
		ob2.cart();
	    SaucedemoCheckoutpage ob3=new SaucedemoCheckoutpage(driver);
	    ob3.setup();
	    ob3.checkout();


	}
	@Test
	public void login() 
	{
		String exp="https://www.saucedemo.com/";
		String actual=driver.getCurrentUrl();
		if(actual.equalsIgnoreCase(exp))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
	}

}
