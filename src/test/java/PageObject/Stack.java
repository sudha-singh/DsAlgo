package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class Stack {

	WebDriver driver;
	JavascriptExecutor jse ;		

	public Stack (WebDriver driver) {
		
		PageFactory.initElements (driver, this);
		this.jse =  (JavascriptExecutor) driver;
	}
	@FindBy(id = "id_username" )
	WebElement email;
	
	@FindBy (id = "id_password")
	WebElement password;
	
	@FindBy (xpath = "//input[@type='submit']")
	WebElement loginbttn;
	
	@FindBy(xpath = "//a[@href='stack']")
	WebElement stackgetstartTab;
	
	@FindBy(xpath = "//a[normalize-space()='Operations in Stack']")
	WebElement OperationsinstackTab;
	
	@FindBy (xpath = "//a[@class='list-group-item list-group-item-light text-info']")
	WebElement practicequestionTab;
	
	@FindBy(xpath = "//a[@class='btn btn-info']")
	WebElement operatryHereTab;
	
//	@FindBy (xpath = "//pre[@class='CodeMirror-gutter-filler']")
//	WebElement testCode1;
//	
	@FindBy (name = "code")
	WebElement testCode1;
	
	@FindBy (xpath = "//button[@type='button']")
	WebElement runButton1;
	
	@FindBy (xpath = "//a[normalize-space()='Implementation']")
	WebElement implementationTab;
	
	@FindBy (xpath = "//a[@class='btn btn-info']")
	WebElement impletryHeretab;
	
	@FindBy (xpath = "//div[@class='CodeMirror-scroll']")
	WebElement testCode2;
	
	@FindBy (xpath = "//button[@type='button']")
	WebElement runButton2;
	
	@FindBy (xpath = "//a[normalize-space()='Applications']")
	WebElement applicationTab;
	
	@FindBy (xpath = " //a[@class='btn btn-info']")
	WebElement applitryHeretab;
	
	@FindBy (xpath = "//a[@class='list-group-item list-group-item-light text-info']")
	WebElement PracticeQuestiontab;
	
	@FindBy (xpath = "//button[@type='button']")
	WebElement runButton;
	
	
	public void enteremail(String emailadd) {
		email.sendKeys(emailadd);
		}
	
	public void enterpassword(String pwd) {
		password.sendKeys(pwd);
		}
	
	public void clickonloginbttn() {
		loginbttn.click();	
		}
		
	public void stackgetclick() {
		stackgetstartTab.click();
	}
	
	public void opinstack() {
		OperationsinstackTab.click();
	}
	
	public void practicQ() {
		PracticeQuestiontab.click();
	}
	
	public void optryhere() {
		operatryHereTab.click();
	}
	
	public void testCode1() {
		//driver.manage().window().maximize();
		//WebElement textArea = driver.findElement(By.xpath("//pre[@class=' CodeMirror-line ']"));
		jse.executeScript("document.getElementsByClassName('CodeMirror-gutter-filler')[0].value='Neeraj'");
		System.out.println("sudhasingh"+testCode1.getAttribute("value"));
		//textArea.click();
		//testCode1.click();
		//System.out.println("tag name sudha"+textArea.getTagName());
		//testCode1=driver.switchTo().activeElement();
		//WebElement focuselement = driver.switchTo().activeElement();
		//focuselement.click();
		//focuselement.sendKeys(code);
		//testCode1.sendKeys("print(\"Hello World\"");	
		}

	public void testCodeRunButton() {
		runButton1.click();
	}
	
	public void implementation() {
		implementationTab.click();
	}
	
	public void implementationtryhere() {
		impletryHeretab.click();
	}
	
//	public void testCode2() {
//			testCode2.sendKeys("print(\"Hello World\"");	
//	}
	
//	public void testCodeRunButton2() {
//		runButton2.click();
//	}
	
	public void application() {
		applicationTab.click();
	}
	
	public void applicationtryheretab() {
		applitryHeretab.click();
//		WebElement focuselement = driver.switchTo().activeElement();
//		focuselement.click();	
	}
	
	
	
//	public void operationsinstack() {
//		opinstack();
//		optryhere();
//		String code = "print 'Hello from operations in stack'";
//		testCode1(code);
//		testCodeRunButton();
//	}
//	
//	public void implementationinstack() {
//		implementation();
//	}
	
}









