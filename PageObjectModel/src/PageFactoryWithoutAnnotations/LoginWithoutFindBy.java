//VIDEO3:See here I did not use @FINDBY and driver.findelement also, then how it ran well?
//We used the html code id of username, password and loginBtn as webelement variable, so by default selenium pagefactory will compare
//the given initialised variable with the html code variable to check if there is a match.
//So Based on this it performs the operations.
//Also,this LoginWithoutFindBy will not work if that element does'nt have id,name in html code :D :D :D
//This will not be used in industry,only for interview's.
package PageFactoryWithoutAnnotations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginWithoutFindBy {

	public static WebElement txtUsername; //This was defined using PageFactory.
	public static WebElement txtPassword; 
	public static WebElement btnLogin;
	
	@Test
	public void login() {
		System.setProperty("webdriver.chrome.driver", "E:\\Docs\\Selenium\\chromedriver.exe"); //to identify which browser is used.
		WebDriver driver=new ChromeDriver();  //It will launch the chrome browser.
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/validatecredentials"); //It will get the google page
		
		PageFactory.initElements(driver, LoginWithoutFindBy.class);
		txtPassword.sendKeys("admin123");
		btnLogin.click();
	}
}
