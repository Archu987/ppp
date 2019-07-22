package casestudy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class login {
	 WebDriver driver;
	// WebDriverWait wait;
	
    

@Given("Enter the URL for TestMeApp{string}")
public void enter_the_URL_for_TestMeApp(String string) {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\test\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  driver= new ChromeDriver();
	  driver.get("http://192.168.40.4:8083/TestMeApp");
	  driver.manage().window().maximize();
	// driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
	  //wait=new WebDriverWait(driver,30);
	  
}
	@When("TestMe page is displayed")
	public void testme_page_is_displayed() {
		 driver.findElement(By.partialLinkText("SignIn")).click();

	}

	@When("Enter the data{string} ,{string}")
	public void enter_the_data(String string, String string2) {
		driver.findElement(By.name("userName")).sendKeys(string);
		driver.findElement(By.name("password")).sendKeys(string2);
	}

	@Then("click login button")
	public void click_login_button() {
		 driver.findElement(By.name("Login")).click();

}
}
