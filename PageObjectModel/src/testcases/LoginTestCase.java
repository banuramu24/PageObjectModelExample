//VIDEO1: WHY and WHAT about PageObjectModel/Sample Implementation
//Interview la they will ask enna framework you used. tell POM.
//POM : Mainly used for easier maintainence of code.
//POM is used to withstand the modification of any UI components.
//Bcoz UI components properties will continuously get changed according to the 
//upgrade of the web applications.UI applications are not constant.
//Framework types: Data Driven,Page Object Model(POM).
//AIM:Testcase->extract->how to find
//Eg:https://phptravels.com/demo/->HTTP://WWW.PHPTRAVELS.NET
//In this video we see how usually we write a testcase.
//Program1:For Logging we are creating this testcase.
package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import PageObjects.LoginPageObjects;

public class LoginTestCase {

	@Test
	public void login() {
		System.setProperty("webdriver.chrome.driver", "E:\\Docs\\Selenium\\chromedriver.exe"); //to identify which browser is used.
		WebDriver driver=new ChromeDriver();  //It will launch the chrome browser.
		driver.navigate().to("https://phptravels.net/login"); //It will get the google page
		
		//As Per VIDEO:2 of STEP04,we added below.Now run after adding,we get null ptr exception in below username.sendKeys("user@phptravels.com").
		//WHY?? Bcoz to identify any webelement obviously it will identify by using webdriver object only.We cannot identify webelement without
		//webdriver..for this only we use PageFactory, also we used @FindBy there..	similary change for updateprofile also.
		PageFactory.initElements(driver, LoginPageObjects.class);
		LoginPageObjects.username.sendKeys("user@phptravels.com");
		LoginPageObjects.password.sendKeys("demouser");
		LoginPageObjects.submit.click();
		
		//1)Creating object for LoginPageObjects here.
		//LoginPageObjects loginPageObjects = new LoginPageObjects();
		/*
		 * LoginPageObjects.userName(driver).sendKeys("user@phptravels.com");
		 * LoginPageObjects.password(driver).sendKeys("demouser");
		 * LoginPageObjects.loginBtn(driver).click();
		 */
		
		/*
		 * //Email WebElement userName=driver.findElement(By.name("username"));
		 * userName.sendKeys("user@phptravels.com"); //Password WebElement
		 * password=driver.findElement(By.name("password"));
		 * password.sendKeys("demouser"); //Login WebElement
		 * loginButton=driver.findElement(By.xpath("//*[@id=\"loginfrm\"]/button"));
		 * loginButton.click();
		 */
	}
}
