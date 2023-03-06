package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {

	
	WebDriver driver;

	public loginpage (WebDriver Driver) {

	PageFactory.initElements (Driver, this);

	}

	@FindBy(id = "id_username" )
	WebElement email;
	@FindBy (id = "id_password")
	WebElement password;

	@FindBy (xpath = "//input[@type='submit']")

	WebElement loginbttn;

	public void enteremail(String emailadd) {

	email.sendKeys(emailadd);

	}

	public void enterpassword(String pwd) {

	password.sendKeys(pwd);

	}

	public void clickonloginbttn() {

	loginbttn.click();

	}

	
}
