package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import PageObject.Stack;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class stackStepDef {
	
	public WebDriver driver;
	public Stack stack;
	//https://groups.google.com/g/chromedriver-users/c/xL5-13_qGaA
	@Given("The user is on signin page of DsAlgo portal")
	public void the_user_is_on_signin_page_of_ds_algo_portal() {
		WebDriverManager.chromedriver().driverVersion("103.0.5060.66").setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		stack = new Stack(driver);
		driver.get("https://dsportalapp.herokuapp.com/home");
		driver.findElement(By.xpath("//a[normalize-space()='Sign in']"))
		. click();
		}

	@When("The user enter valid email {string}")
	public void the_user_enter_valid_email(String email) {
	    stack.enteremail(email);
	}

	@When("The user enter valid password {string}")
	public void the_user_enter_valid_password(String pwd) {
		stack.enterpassword(pwd);
	}

	@When("The user click on login button")
	public void the_user_click_on_login_button() {
		stack.clickonloginbttn();
	}

	
	@Then("The user redirected to homepage")
	public void the_user_redirected_to_homepage() {	
		System.out.println("Page Title is: "+driver.getTitle());
	}

	@Given("The user is in Ds Algo home page")
	public void the_user_is_in_ds_algo_home_page() {	
	}

	@When("The user clicks on Get Started tab of stack box")
	public void the_user_clicks_on_get_started_tab_of_stack_box() {
		stack.stackgetclick();
	}

	@Then("The user directed to stack data structure page")
	public void the_user_directed_to_stack_data_structure_page() {
		System.out.println("Page Title is : "+driver.getTitle());
	}

	@Given("The user is in stack page after logged in")
	public void the_user_is_in_stack_page_after_logged_in() {
	}

	@When("The user click on operation in stack link")
	public void the_user_click_on_operation_in_stack_link() {
	   stack.opinstack();
	}

	@Then("The user directed to operation in stack page")
	public void the_user_directed_to_operation_in_stack_page() {	
		Assert.assertEquals(driver.getTitle(), "Operations in Stack");
	}
	
	@When("The user click on practice question link it navigates to  practice page")
	public void the_user_click_on_practice_question_link_it_navigates_to_practice_page() {
	    stack.practicQ();
	}
	
	@Then("The user directed to practice page")
	public void the_user_directed_to_practice_page() {
		Assert.assertEquals(driver.getTitle(), " Practice Questions ");
	}

	@Given("The user is in operations in stack page after logged in")
	public void the_user_is_in_operations_in_stack_page_after_logged_in() {	 
	}

	@When("The user click on try here button on operations in stack page")
	public void the_user_click_on_try_here_button_on_operations_in_stack_page() {
	   stack.optryhere();
	}

	@Then("The user directed to Try Editor page of operations in stack page having run button to test")
	public void the_user_directed_to_try_editor_page_of_operations_in_stack_page_having_run_button_to_test() {
		Assert.assertEquals(driver.getTitle(), "Assessment");
	}

	@Given("The user is in a tryEditor page having run button to test")
	public void the_user_is_in_a_try_editor_page_having_run_button_to_test() {	    
	}

	@When("The user enter valid python code in tryEditor")
	public void the_user_enter_valid_python_code_in_try_editor() {
		stack.testCode1();	   
	}

	@And("The user clicks on run button")
	public void the_user_clicks_on_run_button() {
	    stack.testCodeRunButton();
	}

	@Then("The user should be getting run result")
	public void the_user_should_be_getting_run_result() {
	    System.out.println("you are at end");
	}
	
	@When("The user click on implementation link")
	public void the_user_click_on_implementation_link() {
	   stack.implementation();
	}

	@Then("The user directed to implementation page")
	public void the_user_directed_to_implementation_page() {
		Assert.assertEquals(driver.getTitle(), "Implementation");
	}

	@When("The user click on try here button on implementation page")
	public void the_user_click_on_try_here_button_on_implementation_page() {
	    stack.implementationtryhere();
	}

	@Then("The user directed to Try Editor page of implementation page having run button to test")
	public void the_user_directed_to_try_editor_page_of_implementation_page_having_run_button_to_test() {	 
		Assert.assertEquals(driver.getTitle(), "Assessment");
	}
	
	@When("The user click on application link")
	public void the_user_click_on_application_link() {
	   stack.application();
	}
	@Then("The user directed to application page")
	public void the_user_directed_to_application_page() {
		Assert.assertEquals(driver.getTitle(), "Applications");
	}

	@When("The user click on try here button on application page")
	public void the_user_click_on_try_here_button_on_application_page() {
	    stack.applicationtryheretab();
	}

	@Then("The user directed to Try Editor page of application page having run button to test")
	public void the_user_directed_to_try_editor_page_of_application_page_having_run_button_to_test() {
	}
}
