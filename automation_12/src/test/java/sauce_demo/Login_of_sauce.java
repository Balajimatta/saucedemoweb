package sauce_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_of_sauce {
	public WebDriver d;
	public Login_of_sauce(WebDriver wd)
	{
		d=wd;
	}
     By uname=By.id("user-name");
     By pword=By.id("password");
     By lgn=By.id("login-button");
     public void username(String un)
     {
    	 d.findElement(uname).clear();
    	 d.findElement(uname).sendKeys(un);;
    	 
    	 
     }
     public void password(String pass)
     {
    	 d.findElement(pword).clear();
    	 d.findElement(pword).sendKeys(pass);
    	 
    	 
     }
     public void login()
     {
    	 d.findElement(lgn).click();
    	 
     }
     public void allin(String un,String pass)
     {
    	 d.findElement(uname).clear();
    	 d.findElement(uname).sendKeys(un);;
    	 d.findElement(pword).clear();
    	 d.findElement(pword).sendKeys(pass);
    	 d.findElement(lgn).click();
     }


}
