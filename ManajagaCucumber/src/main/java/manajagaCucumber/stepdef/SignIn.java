package manajagaCucumber.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignIn 
{

	WebDriver driver;
	
	@Given("Navigate to Sign-In Page")
	public void navigate_to_Sign_In_Page() 
	{
		System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http:\\Manajaga.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@href='#'][contains(.,'Sign In')]")).click();
		
	}

	@When("User signed in using Username and Password")
	public void user_signed_in_using_Username_and_Password() throws InterruptedException 
	{
	
		driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys("shiva.dba84@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[contains(@id,'password-field')]")).sendKeys("123456");
		Thread.sleep(1000);
		
	}

	@And("Click on Sign-in button")
	public void click_on_Sign_in_button() 
	{
	
		driver.findElement(By.xpath("//button[contains(.,'Login')]")).click();
		
	}

	@Then("User is navigated to the Home Page")
	public void user_is_navigated_to_the_Home_Page() 
	{
		
		WebElement MyAccount=driver.findElement(By.xpath("//a[@title='My Account']"));
		boolean flag=MyAccount.isDisplayed();
		System.out.println("Signed in My account -->" +flag);
		driver.close();
	}

	
	
}
