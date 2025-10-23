package sauce_demo;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class calling_page {

			public static void main(String[] args) throws InterruptedException {
				WebDriver wd = new FirefoxDriver();
				wd.get("https://www.saucedemo.com/");
				wd.manage().window().maximize();
				wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				Login_of_sauce lg=new Login_of_sauce(wd);
				lg.username("standard_user");
				 lg.password("secret_sauce");
				lg.login();
				add_to_cart_sauce pr=new add_to_cart_sauce(wd);
				pr.allElement();
				Your_product yp=new Your_product(wd);
				yp.AllElements();
				checkout co=new checkout(wd);
				co.userDetails();
				Logout_sauce lo=new Logout_sauce(wd);
				lo.logout();

			}

		}	// TODO Auto-generated method stub

	


