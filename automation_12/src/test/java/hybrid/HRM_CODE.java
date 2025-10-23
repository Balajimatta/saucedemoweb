package hybrid;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HRM_CODE {

	public static void main(String[] args) {


	                                                                                      {
	 WebDriver wd=new ChromeDriver();
	 wd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	 wd.manage().window().maximize();
	 wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 
	 WebDriverWait wt=new WebDriverWait(wd,Duration.ofSeconds(20));
	 wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]")));
	 
	 wd.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");
	 
	 wd.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123");
	 
	 wd.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	 
	 System.out.println("Login successful");
	 
	// wd.quit();

	}


	}

}
