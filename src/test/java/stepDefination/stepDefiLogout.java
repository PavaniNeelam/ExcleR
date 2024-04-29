package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefiLogout {
	WebDriver driver;
	@Given("User is on Home page")
	public void user_is_on_home_page() throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
		Thread.sleep(2000);
		

	}

	@When("user clik on image")
	public void user_clik_on_image() {
		driver.findElement(By.className("oxd-userdropdown-tab")).click();
	}

	@When("click on logout")
	public void click_on_logout() {
		driver.findElement(By.linkText("Logout")).click();
	}

	@Then("user should navigate to login page")
	public void user_should_navigate_to_login_page() {
		System.out.println("user is on login ");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}




}
