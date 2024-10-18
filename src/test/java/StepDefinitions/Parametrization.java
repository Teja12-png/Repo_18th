package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class Parametrization {
	WebDriver driver = null;
	
	@Given("browser is opened")
	public void browser_is_opened() {
		System.out.println("Inside user- browser is opend");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	   
	}

	@And("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("Inside user- user is on login page");
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_valid_username_password(String username,String password) {
		System.out.println("Inside user- user enters username and password ");
		System.out.println("Inside Step- User enters valid username and password");
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		
	}

	@And("user click on login")
	public void user_click_on_login() {
		System.out.println("Inside user- browser clicks on login");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		System.out.println("Inside Step- User enters valid username and password");
		driver.getPageSource().contains("OrangeHRM");
		driver.close();
		driver.quit();
		
	}


}
