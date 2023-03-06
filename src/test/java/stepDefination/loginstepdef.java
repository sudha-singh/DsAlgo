package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.loginpage;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class loginstepdef {
public WebDriver driver;
public loginpage loginpg;
	
	
	@Given("User is in Sign in Page")
	public void user_is_in_sign_in_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		loginpg = new loginpage(driver);
		driver.get("https://dsportalapp.herokuapp.com/home");
		driver.findElement(By.xpath("//a[normalize-space()='Sign in']"))
		. click();
	}
	
	@When("User enters valid email {string}")
	public void user_enters_valid_email(String email) {
	   loginpg.enteremail(email);
	}

	@And("User enters valid password  {string}")
	public void user_enters_valid_password(String pwd) {
	   loginpg.enterpassword(pwd);
	}

	@Then("Click on Login button to verify")
	public void click_on_login_button_to_verify() {
	   loginpg.clickonloginbttn();
	}
}


