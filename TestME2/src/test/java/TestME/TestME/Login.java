package TestME.TestME;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;




public class Login {
	private static final CharSequence Password = null;
	public static WebDriver driver;
	
	 
	
	
	
	
	@Given("I want to enter the url")
public void i_want_to_enter_the_url() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\test\\Desktop\\down\\chromedriver.exe");
		
		driver =new ChromeDriver();
		
		
		driver.get("http://192.168.40.4:8083/TestMeApp1");	
}

@Given("click on signup")
public void click_on_signup() {
   
    driver.findElement(By.linkText("SignUp")).click();
}

@When("I click on signup")
public void i_click_on_signup() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
}

@When("I enter username")
public void i_enter_username() {
	driver.findElement(By.id("userName")).sendKeys("Chandru");
}

@When("I enter firstname")
public void i_enter_firstname() {
	driver.findElement(By.id("firstName")).sendKeys("T");
}

@When("I enter Lastname")
public void i_enter_Lastname() {
	driver.findElement(By.id("lastName")).sendKeys("T");
}
@When("I enter password and confirm password")
public void i_enter_password_and_confirm_password() {
	driver.findElement(By.id("password")).sendKeys("abcdef12");
	driver.findElement(By.id("pass_confirmation")).sendKeys("abcdef12");
	  
}

@When("I enter Gender")
public void i_enter_Gender() {
	driver.findElement(By.xpath(".//span[text()='Male']")).click();
    
}

@When("I enter Email and Mobile Number")
public void i_enter_Email_and_Mobile_Number() {
	driver.findElement(By.id("emailAddress")).sendKeys("tchandru97@gmail.com");
	driver.findElement(By.id("mobileNumber")).sendKeys("8778475409");
}

@When("I enter DOB and Address")
public void i_enter_DOB_and_Address() {
	driver.findElement(By.id("dob")).sendKeys("21/08/1997");
	driver.findElement(By.id("address")).sendKeys("3jnkjfderwetdcgf");
}

@When("I enter Security Questions")
public void i_enter_Security_Questions() {
	Select qn= new Select(driver.findElement(By.id("securityQuestion")));
	qn.selectByVisibleText("What is your Birth Place?");
}

@When("I enter answer for the security Question")
public void i_enter_answer_for_the_security_Question() {
    driver.findElement(By.id("answer")).sendKeys("chen");
  
}

@Then("Click on Register link")
public void click_on_Register_link() {
	driver.findElement(By.xpath(".//input[@value='Register']")).click();
}

@Then("Homepage is displayed")
public void homepage_is_displayed() {
    
}


}
