package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WellsFargo {
	WebDriver driver;
	String userEmail = "sanjay.yerrolla@gmail.com";
	
	@Given("User is on WellsFargo Login Page")
	public void user_is_on_wells_fargo_login_page() throws InterruptedException {
		System.setProperty("driver.chrome.driver", "/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://wd1.myworkdaysite.com/en-US/recruiting/wf/WellsFargoJobs");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@class='css-myllji'])[2]")).click();	    
	}

	@When("User enter the credentials and sign on")
	public void user_enter_the_credentials_and_sign_on() {
	    driver.findElement(By.xpath("//input[@class='css-1d46vxi']")).sendKeys(userEmail);
	    driver.findElement(By.xpath("(//input[@class='css-1d46vxi'])[2]")).sendKeys("Lucky@164204");
	    driver.findElement(By.cssSelector("div.css-81euhs")).click();
	}

	@Then("User is logged into Wellsfargo home page")
	public void user_is_logged_into_wellsfargo_home_page() {
		
		String candidateHomePageUrl="https://wd1.myworkdaysite.com/en-US/recruiting/wf/WellsFargoJobs/userHome";
		driver.findElement(By.xpath("//nav[@class='css-1hafuyi']//child::button[3]")).click();
		String currentUrl = driver.getCurrentUrl();
		/*if(!(currentUrl.equals(candidateHomePageUrl)))
		{
			
			fail("User is nor candidate Home Page");
		}*/
		
	   
	}

	

}
