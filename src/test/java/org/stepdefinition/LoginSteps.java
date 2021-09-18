package org.stepdefinition;
import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {
	static WebDriver driver;
	@Given("The user should successfully log into home page")
	public void the_user_should_successfully_log_into_home_page() {
		WebDriverManager.chromedriver().setup();
		driver  = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}

	@When("The user should search the products in search in textbox")
	public void the_user_should_search_the_products_in_search_in_textbox() {
		
	}
	@When("The user should select the products as{string}")
	public void the_user_should_select_the_products_as(String value) {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(value);
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.xpath("//span[contains(text(),'New Apple iPhone 11 (64GB) - Purple')]")).click();
		String parentid = driver.getWindowHandle();
		Set<String> allid = driver.getWindowHandles();
		for (String eachid : allid) {
			if (!parentid.equals(eachid)) {
				driver.switchTo().window(eachid);
			}}
	   driver.findElement(By.id("add-to-cart-button")).click();
	 }
   @When("The user should search the products in searchtextbox")
	public void the_user_should_search_the_products_in_searchtextbox() {
	}

	@Then("the user should get the product name{string}")
	public void the_user_should_get_the_product_name(String string) {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(string);
		driver.findElement(By.id("nav-search-submit-button")).click();
		//Assert.fail();
}
	@Before
	public void beforescenario() {	
		System.out.println("before scenario......");

		}
	@After
	public void afterscenario(Scenario s) throws IOException {
		System.out.println("after scenario.....");	
		TakesScreenshot tk=(TakesScreenshot)driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		String name = s.getName();
		File des=new File("C:\\Users\\91897\\eclipse-workspace\\CUCUMBER1\\src\\test\\resources\\Screenshots"+name+".png");
		FileUtils.copyFile(src, des);

		//byte[] bs = tk.getScreenshotAs(OutputType.BYTES);
		//s.embed(bs,"image/png");

	}
	}