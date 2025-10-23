package sauce_demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class add_to_cart_sauce {
	
	public WebDriver d;
		
		public add_to_cart_sauce(WebDriver wd)
		{
			d=wd;
		}
		
		By cart1=By.id("add-to-cart-sauce-labs-backpack");
		By cart2=By.id("add-to-cart-sauce-labs-bike-light");
		By cart3=By.id("add-to-cart-sauce-labs-bolt-t-shirt");
		By logo=By.id("shopping_cart_container");

			public void cart1()
			{
				d.findElement(cart1).click();
			}
			public void cart2()
			{
				d.findElement(cart2).click();
			}
			public void cart3()
			{
				d.findElement(cart3).click();
			}
			public void cartLogo()
			{
				d.findElement(logo).click();
			}
			public void allElement()
			{
				cart1();
				cart2();
				cart3();
				cartLogo();
				
			}
			
		
		
		
		

		
	}

