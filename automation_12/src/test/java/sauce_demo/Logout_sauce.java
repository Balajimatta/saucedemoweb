package sauce_demo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class Logout_sauce {
	
		public  WebDriver d;
	  public Logout_sauce(WebDriver wd) 
			
		{
			d=wd;
		}
		//Repository of WebElement
		By b=By.xpath("/html/body/div/div/div/div[1]/div[1]/div[1]/div/div[1]/div/button");
		By out=By.xpath("/html/body/div/div/div/div[1]/div[1]/div[1]/div/div[2]/div[1]/nav/a[3]");
		
		
		public void menu() throws InterruptedException
		{
			d.findElement(b).click();
			Thread.sleep(2000);
		}
		public void logout()
		{
			d.findElement(out).click();
		}
		
	}
