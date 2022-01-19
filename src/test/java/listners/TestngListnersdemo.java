package listners;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import io.qameta.allure.Story;


public class TestngListnersdemo {

	@Test (priority = 1,description = "Entering Tests")
	@Epic("EP001")
	@Feature("Feature1: entering tests")
	@Story("Story:Reporting")
	@Step("Verify test1")
	public void test1() {
		System.out.println("I am inside Test 1");
		
		
	}
@Test (priority = 2,description = "Login Test")
@Epic("EP002")
@Feature("Feature2: Login")
@Story("Story: Login successful")
@Step("Verify login")
public void test2() throws InterruptedException {
		System.out.println("I am inside Test 2");
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		   WebDriverManager.chromedriver().setup();
	       WebDriver driver = new ChromeDriver();
	       driver.get("https://www.saucedemo.com/");
	       driver.findElement(By.name("user-name")).sendKeys("problem_user");
	       driver.findElement(By.name("password")).sendKeys("secret_sauce");
	       driver.findElement(By.name("login-button")).click();
	       Thread.sleep(800);
	       driver.close();
	}
@Test(priority = 3)	
@Epic("EP003")
@Feature("Feature3: registering")
@Story("Story: Login successful")
@Step("Verify test3")
	public void test3() {
		System.out.println("I am inside Test 3");
		throw new SkipException("This test is skipped");
	}

}
