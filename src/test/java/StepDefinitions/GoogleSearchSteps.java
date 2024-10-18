//package StepDefinitions;
//
//import java.time.Duration;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.*;
//
//public class GoogleSearchSteps {
//	WebDriver driver = null;
//
//	@Given("browser is open")
//	public void browser_is_open() {
//		System.out.println("Inside Step-browser is opened");
//		driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
//	    driver.manage().window().maximize();
//		
//		
//		
//
//	}
//
//	@And("user is on google search page")
//	public void user_is_on_google_search_page() throws InterruptedException {
//		System.out.println("Inside Step-user is on google search page");
//		driver.navigate().to("https://www.google.com/");
//		driver.findElement(By.id("APjFqb")).sendKeys("INDIA");
//		Thread.sleep(2000);
//		
//		
//
//	}
//
//	@When("user enters a text in search box field")
//	public void user_enters_a_text_in_search_box_field() throws InterruptedException {
//		System.out.println("Inside Step-user enters a text in search box field");
//		Thread.sleep(2000);
//
//	}
//
//	@And("hits enter")
//	public void hits_enter() throws InterruptedException {
//		System.out.println("Inside Step-user hits enter");
//		driver.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);
//		Thread.sleep(2000);
//
//	}
//
//	@Then("user is navigate to search results")
//	public void user_is_navigate_to_search_results() {
//		System.out.println("Inside Step-user is navigated to search results");
//		driver.getPageSource().contains("Top stories");
//		driver.close();
//
//	}
//
//}
//
//
//
