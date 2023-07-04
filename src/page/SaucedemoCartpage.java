package page;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;

public class SaucedemoCartpage {
	WebDriver driver;
	By cartbutton=By.xpath("//*[@id=\'shopping_cart_container\']/a/span");
	By remove=By.xpath("//*[@id='remove-sauce-labs-bolt-t-shirt']");
	By checkout=By.xpath("//*[@id=\'checkout\']");
	
	public SaucedemoCartpage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void cart() throws InterruptedException
	{

		driver.findElement(cartbutton).click();
		Thread.sleep(2000);
		driver.findElement(remove).click();
		Thread.sleep(2000);
        driver.findElement(checkout).click();
        
	}
}
