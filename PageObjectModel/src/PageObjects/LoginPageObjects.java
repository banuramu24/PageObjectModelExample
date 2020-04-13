////VIDEO1: WHY and WHAT about PageObjectModel/Sample Implementation.
//Program3: Why Program3 concept came? Bcoz we are going to find,segregate and take outside.
//In this we shall have only //UserName, //Password, //SubmitBtn.
//Create methods for that..
package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageObjects {

	//UserName //Password //SubmitBtn
	
	//STEP1:Creating methods for //UserName //Password //LoginBtn.
	//STEP2:Have only driver.findelement here from LoginTestCase.java
	//STEP3:Pass the driver method to each of () here, bcoz Browser method has been created in LoginTestCase.java.
	//STEP4:goto LoginTestCase.java now and have only browser creator.comment the rest.
	//STEP5:Create object for LoginPageObjects in LoginTestCase.java to pass the driver from LoginTestCase.java to LoginPageObjects.
	//STEP6:After creating object for LoginPageObjects, throw driver through username as parameter.
	//STEP7:Now it will some red error in username as create a parameter in LoginPageObjects as userName(WebDriver driver).So create that.
	//STEP8:I need to send some values using sendkeys correct ah.But i'm not sendkeys option in LoginTestCase.java becoz LoginPageObjects has type void.
	//STEP9:Now change the function to WebElement, keep cursor in findElement it will show Webelement.
	//STEP10:Add return statement.
	//STEP11:Now goto LoginTestCase.java and using sendkeys give username.
	//STEP12:But see, now everything is ok, but dependency create aagudhu la, in LoginTestCase.java,to avoid dependency injection,
	//STEP13:Use static keyword so that we dont need to create objects.
	//STEP14:Goto LoginTestCase.java and delete the object creating method and add for password and login also..
	//very very important.STEP15:Webelement creation method should always be declared static.
	//STEP16:Now see we have achieved reusability,understandle,organisable even if the UI components properties changes also, we no need to worry.
	
	//STEP17 : VIDEO2 : Starts here. very very important. (In Industry Wise). We use this concept only.
	//STEP01:Now In selenium,to implement POM,we have page factory class.Enhancing our POM project with selenium page factory.
	//very very important STEP02: In Interview they ask : I should not use findElement but i need to retrieve WebElement(If i say I know POM).
	//Or How to populate values to Webelement without using findElement?? We achieve this by @FindBy annotation in pagefactory.
	//Now remove all the below methods, create 3 variables for username,password and submit as below.
	//STEP03:Now go and see LoginTestCase.java it will show error, bcoz we deleted all the methods here.
	//STEP04:Goto and see LoginTestCase.java.
	
	@FindBy(how=How.NAME,using="username")
	public static WebElement username;
	
	@FindBy(name="password")
	public static WebElement password;
	
	@FindBy(xpath="//*[@id=\"loginfrm\"]/button") 
	public static WebElement submit;

	/*
	 * public static WebElement userName(WebDriver driver) { return
	 * driver.findElement(By.name("username")); }
	 * 
	 * public static WebElement password(WebDriver driver) { return
	 * driver.findElement(By.name("password")); }
	 * 
	 * public static WebElement loginBtn(WebDriver driver) { return
	 * driver.findElement(By.xpath("//*[@id=\"loginfrm\"]/button")); }
	 */
}
