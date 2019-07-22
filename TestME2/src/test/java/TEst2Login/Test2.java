package TEst2Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Test2 {
	public static WebDriver driver;
	
	
	
	
	@Given("I want to enter the url")
	public void i_want_to_enter_the_url() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
System.setProperty("webdriver.chrome.driver","C:\\Users\\test\\Desktop\\down\\chromedriver.exe");
		
		driver =new ChromeDriver();
		
		
		driver.get("http://192.168.40.4:8083/TestMeApp1");	
	}

	@Given("click on signin")
	public void click_on_signin() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.linkText("SignIn")).click();
	}

	@Given("I enter {string} and  {string}")
	public void i_enter_and(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.id("userName")).sendKeys(string);
		driver.findElement(By.id("password")).sendKeys(string2);
	}

	@Given("I click on Login")
	public void i_click_on_Login() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.findElement(By.xpath(".//input[@value='Login']")).click();
	}

	@Then("Homepage is displayed")
	public void homepage_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}


}
