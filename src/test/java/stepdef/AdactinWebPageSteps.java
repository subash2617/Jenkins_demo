package stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import cucumber.api.java.en.*;

public class AdactinWebPageSteps {

	WebElement SingleSelect;
	WebDriver driver;

	@Given("User launch the browser and navigate to adactin login page")
	public void user_launch_the_browser_and_navigate_to_adactin_login_page() {
		System.setProperty("webdriver.edge.driver", 
				"C:\\Users\\SUBASH\\eclipse-workspace\\Jenkins\\driver\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://adactinhotelapp.com/");
	}

	@When("User enters the username and password in adacting page")
	public void user_enters_the_username_and_password_in_adacting_page() {
		driver.findElement(By.id("username")).sendKeys("subash26");
		driver.findElement(By.id("password")).sendKeys("Subash@123");
	}

	@When("User clicks the login button in adacting page")
	public void user_clicks_the_login_button_in_adacting_page() {
		driver.findElement(By.id("login")).click();
	}

	@Then("User navigated to the adacting home page")
	public void user_navigated_to_the_adacting_home_page() {
		System.out.println("Done!");
	}
	
	@When("Close the Browser")
	public void close_the_Browser() {
	    driver.close();
	}

}
