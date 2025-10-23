package basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo_interact {

	public static void main(String[] args) throws InterruptedException {
		WebDriver wb=new ChromeDriver();
		wb.get("https://demo.automationtesting.in/Register.html");
		wb.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		wb.findElement(By.cssSelector("input[type='text']")).sendKeys("master");
		Thread.sleep(2000);
		wb.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys("suraj");
		wb.findElement(By.cssSelector("textarea[rows='3']")).sendKeys("premnagar tekdi ulhasnagar 5");
		Thread.sleep(2000);
		wb.findElement(By.className("col-sm-4")).sendKeys("balajimatta92@gmail.com");
	

	}

}
