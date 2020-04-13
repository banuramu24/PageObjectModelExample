////VIDEO1: WHY and WHAT about PageObjectModel/Sample Implementation.
//Program4: Why Program3 concept came? Bcoz we are going to find,segregate and take outside.
//In this we shall have //myProfile //City //Phone //Submit along with //UserName, //Password, //SubmitBtn.
//Create methods for that..
package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class UpdateProfileObjects {
	
	//myProfile //City //Phone //Submit
	
	@FindBy(how=How.XPATH,using="/html/body/div[2]/div[1]/div[2]/div[2]/div/div[1]/div[1]/aside/nav/ul/li[2]")
	public static WebElement myProfile;
	
	@FindBy(name="phone")
	public static WebElement phoneNumber;
	
	@FindBy(name="city")
	public static WebElement city;
	
	@FindBy(xpath="//*[@id=\"profilefrm\"]/div/div/div[7]/div/button") 
	public static WebElement submit;
	
	/*
	 * public static WebElement myProfile(WebDriver driver) { return
	 * driver.findElement(By.xpath(
	 * "/html/body/div[2]/div[1]/div[2]/div[2]/div/div[1]/div[1]/aside/nav/ul/li[2]"
	 * )); }
	 * 
	 * public static WebElement phoneNumber(WebDriver driver) { return
	 * driver.findElement(By.name("phone")); }
	 * 
	 * public static WebElement city(WebDriver driver) { return
	 * driver.findElement(By.name("city")); }
	 * 
	 * public static WebElement submit(WebDriver driver) { return
	 * driver.findElement(By.xpath(
	 * "//*[@id=\"profilefrm\"]/div/div/div[7]/div/button"));
	 * 
	 * }
	 */
}
