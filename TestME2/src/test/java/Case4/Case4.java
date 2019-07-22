package Case4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Case4 {
	
	public static WebDriver driver;
	
	
	
	@Given("Alex has registered into the TestMeApp")
	public void alex_has_registered_into_the_TestMeApp() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
System.setProperty("webdriver.chrome.driver","C:\\Users\\test\\Desktop\\down\\chromedriver.exe");
		 driver =new ChromeDriver();
		
		 driver.get("http://192.168.40.4:8083/TestMeApp1");	
		
		driver.findElement(By.linkText("SignIn")).click();
		
		driver.findElement(By.id("userName")).sendKeys("Chandru");
		
		driver.findElement(By.id("password")).sendKeys("abcdef12");
		
		driver.findElement(By.xpath(".//input[@value='Login']")).click();
	}

	@When("Alex search a particular item like headphone")
	public void alex_search_a_particular_item_like_headphone() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	    driver.findElement(By.xpath(".//span[contains(text(),'All')]")).click();
	  
	    driver.findElement(By.xpath(".//span[contains(text(),'Electronics')]")).click();
	   
	    driver.findElement(By.xpath(".//span[contains(text(),'Head Phone')]")).click();
	    //driver.findElement(By.xpath(".//a[@class= 'btn btn-success btn-product']")).click();
	   // driver.findElement(By.xpath(".//a[@href= 'displayCart.htm']")).click();
	    }

	@When("try to proceed to the payment without adding any item in the cart")
	public void try_to_proceed_to_the_payment_without_adding_any_item_in_the_cart() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		if(driver.findElements(By.cssSelector("i.fa.fa-shopping-cart")).size()!=0)
		{
			 driver.findElement(By.cssSelector("i.fa.fa-shopping-cart")).click();
		}
		else
		{
			System.out.println("Not visible");
		}
		
	}

	@Then("TestMeApp doesn't display the cart icon")
	public void testmeapp_doesn_t_display_the_cart_icon() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

}
