package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination {
	WebDriver driver;

	@Given("user is on login page")
	public void user_is_on_login_page() throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
	   
	}

/*	@When("user enters username and password")
	public void user_enters_username_and_password() throws InterruptedException {
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
	    // Write code here that turns the phrase above into concrete actions
	    Thread.sleep(2000);
	}*/
	
	@When("user enters username as {string} and password as {string}")
	public void user_enters_username_as_and_password_as(String un, String pass) {
		driver.findElement(By.name("username")).sendKeys(un);
		driver.findElement(By.name("password")).sendKeys(pass);
	     
	}

	@When("click on login page")
	public void click_on_login_page() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	   
	}

	@Then("user should navigate to homepage")
	public void user_should_navigate_to_homepage() throws InterruptedException {
		System.out.println("user is on homepage");
		Thread.sleep(2000);
		/*WebElement dash=driver.findElement(By.className("oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module")).click();
		if(dash.isDisplayed()==true) {
			System.out.println("login succesfull");
		}
		else {
			System.out.println("invalid login");
		}
	*/
		
	   
	}




}
