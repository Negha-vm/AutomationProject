package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SaucedemoProductpage {
	WebDriver driver;

	By sort=By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select");
	By sortselect=By.xpath("//div[@class='header_secondary_container']/div/span/select/option[4]");
	By item1=By.xpath("//*[@id=\'item_1_title_link\']/div");
	By cart1=By.xpath("//*[@id=\'add-to-cart-sauce-labs-bolt-t-shirt\']");
	By item2=By.xpath("//*[@id='item_4_title_link']/div");
	By cart2=By.xpath("//*[@id=\'add-to-cart-sauce-labs-backpack\']");
	
	public SaucedemoProductpage(WebDriver driver) {
		this.driver=driver;
	}
	public void product() throws InterruptedException
	{

		driver.findElement(sort).click();
		Thread.sleep(2000);
		driver.findElement(sortselect).click();
		Thread.sleep(2000);
		driver.findElement(item1).click();
		Thread.sleep(2000);
		driver.findElement(cart1).click();
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(item2).click();
		Thread.sleep(2000);
		driver.findElement(cart2).click();

		
	}
	

}
