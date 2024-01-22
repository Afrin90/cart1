package CartStepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Step1 {

	WebDriver driver;
	
	@Given("^Open URL$")
	public void open_URL() throws Throwable {
		System.setProperty("webdriver.chrome.drive", "C:\\new Driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://demoblaze.com/");
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
	}

	@Then("^Click on cart link$")
	public void click_on_cart_link() throws Throwable {
	  driver.findElement(By.id("cartur")).click();
	  Thread.sleep(3000);
	}

	@Then("^Verify Cart link is working Successfully$")
	public void verify_Cart_link_is_working_Successfully() throws Throwable {
	 boolean cart = driver.findElement(By.xpath("//h2[text()='Products']")).isDisplayed();
	 Assert.assertTrue(cart);
	 Thread.sleep(3000);
	 driver.close();
	}
	
}
