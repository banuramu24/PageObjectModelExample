//VIDEO1: WHY and WHAT about PageObjectModel/Sample Implementation.
//Program2:After logging, we are updating city and phone field here.
//After this program we are creating another package called PageObjects. refer that. -> LoginPageObjects
package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import PageObjects.LoginPageObjects;
import PageObjects.UpdateProfileObjects;

public class UpdateProfile {

	@Test
	public void updateProfile() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Docs\\Selenium\\chromedriver.exe"); //to identify which browser is used.
		WebDriver driver=new ChromeDriver();  //It will launch the chrome browser.
		driver.navigate().to("https://phptravels.net/login"); //It will get the google page
		
		//UpdateProfileObjects updateProfileObjects=new UpdateProfileObjects();
		
		//Here we are reproducing the login credentials again using framework.we are resusing that code here.this is called reusable.
		//And also we have reduced drastic number of lines by this framework.
		/*
		 * LoginPageObjects.userName(driver).sendKeys("user@phptravels.com");
		 * LoginPageObjects.password(driver).sendKeys("demouser");
		 * LoginPageObjects.loginBtn(driver).click();
		 */
		
		PageFactory.initElements(driver, LoginPageObjects.class);
		LoginPageObjects.username.sendKeys("user@phptravels.com");
		LoginPageObjects.password.sendKeys("demouser");
		LoginPageObjects.submit.click();
		Thread.sleep(3000);
		PageFactory.initElements(driver, UpdateProfileObjects.class);
		UpdateProfileObjects.myProfile.click();
		UpdateProfileObjects.phoneNumber.sendKeys("1234567890");
		UpdateProfileObjects.city.sendKeys("Kings Landing");
		Thread.sleep(3000);
		UpdateProfileObjects.submit.click();
		
		
		/*
		 * UpdateProfileObjects.myProfile(driver).click();
		 * UpdateProfileObjects.phoneNumber(driver).sendKeys("1234567890");
		 * UpdateProfileObjects.city(driver).sendKeys("Kings Landing");
		 * UpdateProfileObjects.submit(driver).click();
		 */
		
		/*
		 * //Email WebElement userName=driver.findElement(By.name("username"));
		 * userName.sendKeys("user@phptravels.com"); //Password WebElement
		 * password=driver.findElement(By.name("password"));
		 * password.sendKeys("demouser"); //Login WebElement
		 * loginButton=driver.findElement(By.xpath("//*[@id=\"loginfrm\"]/button"));
		 * loginButton.click(); Thread.sleep(3000); //MyProfile WebElement
		 * myProfile=driver.findElement(By.xpath(
		 * "/html/body/div[2]/div[1]/div[2]/div[2]/div/div[1]/div[1]/aside/nav/ul/li[2]"
		 * )); myProfile.click();
		 * 
		 * //City WebElement city=driver.findElement(By.name("city"));
		 * city.sendKeys("Kings Landing");
		 * 
		 * //Phone WebElement phone=driver.findElement(By.name("phone"));
		 * phone.sendKeys("1234567890");
		 * 
		 * //Submit WebElement submit=driver.findElement(By.xpath(
		 * "//*[@id=\"profilefrm\"]/div/div/div[7]/div/button")); submit.click();
		 */
	}
	
	
}
