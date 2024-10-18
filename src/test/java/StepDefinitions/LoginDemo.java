//package StepDefinitions;
//
//import java.time.Duration;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.*;
//
//
//public class LoginDemo {
//	WebDriver driver = null;
//	
//
//@Given("browser is open")
//public void browser_is_open() {
//    System.out.println("Inside Step- browser is open");
//    driver = new ChromeDriver();
//    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
//    driver.manage().window().maximize();
//}
//
//@And("user is on login page")
//public void user_is_on_login_page() {
//	System.out.println("Inside Step- user is on login page");
//	driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//	}
//
//@When("user enters valid username and password")
//public void user_enters_valid_username_and_password() throws InterruptedException {
//	System.out.println("Inside Step- User enters valid username and password");
//	driver.findElement(By.name("username")).sendKeys("Admin");
//	driver.findElement(By.name("password")).sendKeys("admin123");
//	Thread.sleep(2000);
//	
//	  
//	   
//}
//
//@And("user clicks on login")
//public void user_clicks_on_login() throws InterruptedException {
//	System.out.println("Inside Step- User clicks on login");
//	driver.findElement(By.xpath("//button[@type='submit']")).click();
//	Thread.sleep(2000);
//}
//
//@Then("user is navigated to the home page")
//public void user_is_navigated_to_the_home_page() {
//	System.out.println("Inside Step- User is navigated to the home page");
//	driver.getPageSource().contains("OrangeHRM");
//	driver.close();
//	driver.quit();
//}
//
//
//}
//
