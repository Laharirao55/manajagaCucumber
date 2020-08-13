package manajagaCucumber.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Post_Property_Validations 
{

	WebDriver driver;
	
	@Given("^Navigate to Post Free Window$")
	public void Navigate_to_Post_Free_Window() throws Throwable {
		System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http:\\Manajaga.com");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.id("blink_me")).click();
	}
	
//	@Given("$Navigate to Post Free Window^")
//	public void Navigate_to_Post_Free_Window() throws Exception {
//		System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
//		driver= new ChromeDriver();
//		driver.get("http:\\Manajaga.com");
//		driver.manage().window().maximize();
//		Thread.sleep(1000);
//		driver.findElement(By.id("blink_me")).click();
//		
//	}

	@When("User select Post Property and select Sale")
	public void user_select_Post_Property_and_select_Sale() throws Exception {
		driver.findElement(By.xpath("//label[@for='PostProperty']")).click();
		driver.findElement(By.xpath("(//button[@class='btn btn-theme-2 nextBtn'][contains(.,'Next')])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='n_pp_owner']")).click();
		driver.findElement(By.xpath("//label[@for='Sale'][contains(.,'Sale')]")).click();
		driver.findElement(By.xpath("(//button[@class='btn btn-theme-2 nextBtn'][contains(.,'Next')])[2]")).click();
			
	}

	@When("User Select Agricultural Land Property type")
	public void user_Select_Agricultural_Land_Property_type() {
		WebElement propertytype_DD =driver.findElement(By.id("propertyTypeSale"));
		new Select(propertytype_DD).selectByVisibleText("Agriculture Land");
	}

	@Then("Displays Agricultural Land fields")
	public void displays_Agricultural_Land_fields() throws Exception 
	{
	    
			//Facing field validation
				WebElement Facing=driver.findElement(By.id("post-face"));
				boolean flag=Facing.isDisplayed();
				System.out.println("Facing Displayed -->" +flag);
			//Boundary with field validation
				WebElement BoundaryWith=driver.findElement(By.id("boundaryWith"));
				boolean flag1=BoundaryWith.isDisplayed();
				System.out.println("BoundaryWith Displayed -->" +flag1);
			//Now under lease field validation
				WebElement UnderLease=driver.findElement(By.xpath("//label[@for='UnderLeaseNo']"));
				boolean flag2=UnderLease.isDisplayed();
				System.out.println("UnderLease Displayed -->" +flag2);
			//Water availability field validation
				WebElement WaterAvailability =driver.findElement(By.xpath("//label[@for='WaterAvailabilityYes']"));
				boolean flag3 = WaterAvailability.isDisplayed();
				System.out.println("Water Availability Displayed -->" +flag3);
			//Total price field validation
				WebElement TotalPrice  =driver.findElement(By.id("Post-Total-Price"));
				boolean flag4=TotalPrice.isDisplayed();
				System.out.println("TotalPrice Displayed -->" +flag4);
			//Acres field validation
				WebElement Acres=driver.findElement(By.id("post-scres-val"));
				boolean flag5=Acres.isDisplayed();
				System.out.println("Acres Displayed -->" +flag5);
			//Land to main road distance field validation
				WebElement LandToMainRoaddistance=driver.findElement(By.id("post-LandToMainRoaddistance"));
				boolean flag6=LandToMainRoaddistance.isDisplayed();
				System.out.println("LandToMainRoaddistance Displayed -->" +flag6);
			//Metric field validation
				WebElement LandToMainRoaddistanceMetric=driver.findElement(By.id("LandToMainRoaddistanceMetric"));
				boolean flag7=LandToMainRoaddistanceMetric.isDisplayed();
				System.out.println("LandToMainRoaddistanceMetric Displayed -->" +flag7);
			//Soil type field validation
				WebElement soilType=driver.findElement(By.id("soilType"));
				boolean flag8=soilType.isDisplayed();
				System.out.println("soilType Displayed -->" +flag8);
			//Response from field validation
				WebElement responsefrom=driver.findElement(By.id("post-responsefrom"));
				boolean flag9=responsefrom.isDisplayed();
				System.out.println("responsefrom Displayed -->" +flag9);
				System.out.println("       ");
				System.out.println("'Displayed all the fields'");
				
				Thread.sleep(2000);
				driver.close();

		
	}

	@When("User Select Apartment Property type")
	public void user_Select_Apartment_Property_type() {
		//select property from DD
		WebElement propertytype_DD =driver.findElement(By.id("propertyTypeSale"));
		new Select(propertytype_DD).selectByVisibleText("Apartment");

	}

	@Then("Displays Apartment Land fields")
	public void displays_Apartment_Land_fields() throws Exception 
	{
	 
				//bedroom field validation
					WebElement Bedrooms=driver.findElement(By.id("bedrooms"));
					boolean flag=Bedrooms.isDisplayed();
					System.out.println("Bedrooms Displayed -->" +flag);
				//bathroom field validation
					WebElement Bathrooms=driver.findElement(By.id("post-bathrooms"));
					boolean flag1=Bathrooms.isDisplayed();
					System.out.println("Bathrooms Displayed -->" +flag1);
				//total floors field validation
					WebElement TotalFloors=driver.findElement(By.id("post-totalfloors"));
					boolean flag2=TotalFloors.isDisplayed();
					System.out.println("TotalFloors Displayed -->" +flag2);
				//floor no. field validation
					WebElement Floorno=driver.findElement(By.id("post-floorno"));
					boolean flag3=Floorno.isDisplayed();
					System.out.println("Floorno Displayed -->" +flag3);
				//Area field validation
					WebElement Area=driver.findElement(By.id("post-area"));
					boolean flag4=Area.isDisplayed();
					System.out.println("Area Displayed -->" +flag4);
				//Total Area field validation
					WebElement areavalue=driver.findElement(By.id("post-areavalue"));
					boolean flag5=areavalue.isDisplayed();
					System.out.println("areavalue Displayed -->" +flag5);
				//Length field validation
					WebElement Length=driver.findElement(By.id("area-length"));
					boolean flag6=Length.isDisplayed();
					System.out.println("Length Displayed -->" +flag6);
				//Breadth field validation
					WebElement bredth=driver.findElement(By.id("area-bredth"));
					boolean flag7=bredth.isDisplayed();
					System.out.println("Breadth Displayed -->" +flag7);
				//furniture field validation
					WebElement Furniture=driver.findElement(By.id("post-furniture"));
					boolean flag8=Furniture.isDisplayed();
					System.out.println("Furniture Displayed -->" +flag8);
				//Building Age field validation
					WebElement BuildingAge=driver.findElement(By.id("post-buildingage"));
					boolean flag9=BuildingAge.isDisplayed();
					System.out.println("BuildingAge Displayed -->" +flag9);
				//OpenSides field validation
					WebElement OpenSides=driver.findElement(By.id("post-opensides"));
					boolean flag10=OpenSides.isDisplayed();
					System.out.println("OpenSides Displayed -->" +flag10);
				//Facing field validation
					WebElement Facing=driver.findElement(By.id("post-face"));
					boolean flag11=Facing.isDisplayed();
					System.out.println("Facing Displayed -->" +flag11);
				//PoojaRoom field validation
					WebElement PoojaRoom=driver.findElement(By.id("post-poojaroom"));
					boolean flag12=PoojaRoom.isDisplayed();
					System.out.println("PoojaRoom Displayed -->" +flag12);
				//Other room field validation
					WebElement OtherRoom=driver.findElement(By.id("post-otherroom"));
					boolean flag13=OtherRoom.isDisplayed();
					System.out.println("OtherRoom Displayed -->" +flag13);
				//Trade type field validation
					WebElement tradetype=driver.findElement(By.id("post-tradetype"));
					boolean flag14=tradetype.isDisplayed();
					System.out.println("tradetype Displayed -->" +flag14);
				//Possession field validation
					WebElement possession=driver.findElement(By.id("post-possession"));
					boolean flag15=possession.isDisplayed();
					System.out.println("possession Displayed -->" +flag15);
				//Permission field validation
					WebElement permission=driver.findElement(By.id("post-permission"));
					boolean flag16=permission.isDisplayed();
					System.out.println("permission Displayed -->" +flag16);
				//gated community field validation
					WebElement gcommunity=driver.findElement(By.id("post-gcommunity"));
					boolean flag17=gcommunity.isDisplayed();
					System.out.println("gcommunity Displayed -->" +flag17);
				//Venture field validation
					WebElement venture=driver.findElement(By.id("post-venture"));
					boolean flag18=venture.isDisplayed();
					System.out.println("venture Displayed -->" +flag18);
				//parking field validation
					WebElement parking=driver.findElement(By.id("post-parking"));
					boolean flag19=parking.isDisplayed();
					System.out.println("parking Displayed -->" +flag19);
				//Total price field validation
					WebElement	totalprice=driver.findElement(By.id("post-totalprice"));
					boolean flag20=	totalprice.isDisplayed();
					System.out.println("totalprice Displayed -->" +flag20);
				//Response from field validation
					WebElement responsefrom=driver.findElement(By.id("post-responsefrom"));
					boolean flag21=responsefrom.isDisplayed();
					System.out.println("responsefrom Displayed -->" +flag21);
				//Url field validation
					WebElement youtube_url=driver.findElement(By.id("post-youtube-url"));
					boolean flag22= youtube_url.isDisplayed();
					System.out.println("youtube_url Displayed -->" +flag22);
				//Description field validation
					WebElement description=driver.findElement(By.id("post-description"));
					boolean flag23= description.isDisplayed();
					System.out.println("description Displayed -->" +flag23);
					
					System.out.println("       ");
					System.out.println("'Displayed all the fields'");
					
					Thread.sleep(2000);
					driver.close();
				
		
	}

	@When("User Select Commercial Plot Property type")
	public void user_Select_Commercial_Plot_Property_type() {
	    
	}

	@Then("Displays Commercial Plot Land fields")
	public void displays_Commercial_Plot_Land_fields() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User Select Commercial Shop Property type")
	public void user_Select_Commercial_Shop_Property_type() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Displays Commercial Shop Land fields")
	public void displays_Commercial_Shop_Land_fields() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User Select Industrial Land Property type")
	public void user_Select_Industrial_Land_Property_type() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User Select Individual House Property type")
	public void user_Select_Individual_House_Property_type() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Displays Individual House Land fields")
	public void displays_Individual_House_Land_fields() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User Select Office Space Property type")
	public void user_Select_Office_Space_Property_type() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Displays Office Space Land fields")
	public void displays_Office_Space_Land_fields() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User Select Pent House Property type")
	public void user_Select_Pent_House_Property_type() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Displays Pent House Land fields")
	public void displays_Pent_House_Land_fields() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User Select residential Plot Property type")
	public void user_Select_residential_Plot_Property_type() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Displays Residential Plot Land fields")
	public void displays_Residential_Plot_Land_fields() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User Select Ware House Property type")
	public void user_Select_Ware_House_Property_type() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Displays Ware House Land fields")
	public void displays_Ware_House_Land_fields() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


	
	
}
