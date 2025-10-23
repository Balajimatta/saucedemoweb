package sauce_demo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class Your_product {
	

	
	public WebDriver d;
		
		public Your_product(WebDriver wd)
		{
			d=wd;
		}
		By remove_product1=By.id("remove-sauce-labs-backpack");
		By remove_product2=By.id("remove-sauce-labs-bike-light");
		By checkOut=By.id("checkout");
		public void removeProduct1()
		{
			d.findElement(remove_product1).click();
		}
		public void removeProduct2() throws InterruptedException
		{
			d.findElement(remove_product2).click();
			Thread.sleep(5000);
		}
		public void checkOut()
		{
			d.findElement(checkOut).click();

		}
		public void AllElements() throws InterruptedException
		{
			Thread.sleep(5000);
			removeProduct1();
			removeProduct2();
			checkOut();
		}
	}

