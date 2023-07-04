package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SaucedemoCheckoutpage {
    WebDriver driver;

	By firstname=By.id("first-name");
	By lastname=By.id("last-name");
	By zipcode=By.id("postal-code");
	By continuebutton=By.xpath("//*[@id=\'continue\']");
	By finish=By.xpath("//*[@id=\'finish\']");
	By backhomebutton=By.xpath("//*[@id='back-to-products']");
	By humburgermenu=By.xpath("//*[@id=\'react-burger-menu-btn\']");
	By logout=By.xpath("//*[@id=\'logout_sidebar_link\']");
	
		
	public SaucedemoCheckoutpage(WebDriver driver) {

		this.driver=driver;
	}

    public void setup()
    {
    	driver.findElement(firstname).sendKeys("abc");
    	driver.findElement(lastname).sendKeys("d");
    	driver.findElement(zipcode).sendKeys("683594");
    }

	public void checkout() throws InterruptedException
	{
	driver.findElement(firstname).click();
	Thread.sleep(2000);
    driver.findElement(lastname).click();
	Thread.sleep(2000);
    driver.findElement(zipcode).click();
	Thread.sleep(2000);
    driver.findElement(continuebutton).click();
	Thread.sleep(2000);
    driver.findElement(finish).click();
	Thread.sleep(2000);
	driver.findElement(backhomebutton).click();
	Thread.sleep(2000);
	driver.findElement(humburgermenu).click();
	Thread.sleep(2000);
	driver.findElement(logout).click();
	}

}
