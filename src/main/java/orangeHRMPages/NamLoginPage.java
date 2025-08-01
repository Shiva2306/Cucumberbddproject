package orangeHRMPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NamLoginPage {

	//Constructor
	
		private WebDriver driver;
		
		public NamLoginPage(WebDriver driver)
		{
			this.driver=driver;
		}
		
		//Locators or pageElements
		
		private By user= By.xpath("//input[@name='username']");
		private By pass =By.name("password");
		private By cl=By.xpath("//button[@type='submit']");
		
		//Action methods
		public void username(String un)
		{
			driver.findElement(user).sendKeys(un);
		}
		
		public void password(String pw)
		{
			driver.findElement(pass).sendKeys(pw);
		}
		
		public void clbtn()
		{
			driver.findElement(cl).click();
		}
		

}
