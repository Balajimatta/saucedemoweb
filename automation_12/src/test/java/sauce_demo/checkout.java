package sauce_demo;


	

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;

	public class checkout {
	 WebDriver wd;
		
		public checkout(WebDriver wd)
		{
			this.wd=wd;
		}
		By firstName=By.id("first-name");
		By lastName=By.id("last-name");
		By postal=By.id("postal-code");
		By continueButton=By.id("continue");
		By finishButton=By.id("finish");
		By backButton=By.id("back-to-products");
		public void fname(String fn)
		{
			wd.findElement(firstName).sendKeys(fn);

		}
		public void lname(String ln)
		{
			wd.findElement(lastName).sendKeys(ln);
		}
		public void pin(String pinn)
		{
			wd.findElement(postal).sendKeys(pinn);
		}
		public void rbuttons()
		{
			wd.findElement(continueButton).click();
			wd.findElement(finishButton).click();
			wd.findElement(backButton).click();
		}
		
		public void userDetails( ) throws InterruptedException
		{
			wd.findElement(firstName).sendKeys("micheal");
			Thread.sleep(3000);
			wd.findElement(lastName).sendKeys("madagascar");
			wd.findElement(postal).sendKeys("212121");
			wd.findElement(continueButton).click();
			wd.findElement(finishButton).click();
			wd.findElement(backButton).click();
			
		}
	}

