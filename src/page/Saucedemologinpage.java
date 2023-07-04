package page;

import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Saucedemologinpage {
	WebDriver driver;
	
	By username=By.xpath("//*[@id=\'user-name\']");
	By password=By.xpath("//*[@id=\'password\']");
	By login=By.xpath("//*[@id=\'login-button\']");
	
	public Saucedemologinpage(WebDriver driver)
	{
		this.driver=driver;
	}


	public void login() throws Exception 
	{

		FileInputStream f=new FileInputStream("C:\\Users\\Negha\\Desktop\\Test\\Test.xlsx");
	    XSSFWorkbook wb=new XSSFWorkbook(f);
	    XSSFSheet sh=wb.getSheet("Sheet1"); 
	    int row=sh.getLastRowNum();  
	    for(int i=1;i<=row;i++)
	    {
	    	 String Username= sh.getRow(i).getCell(0).getStringCellValue();
	    	 String Password= sh.getRow(i).getCell(1).getStringCellValue();

            driver.findElement(username).sendKeys(Username);
            driver.findElement(username).click();
    		driver.findElement(password).sendKeys(Password); 
    		driver.findElement(password).click();
		    driver.findElement(login).click();
	    }
	}

	
}
