package com.opensource.qa;

import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class Admin {

	String username, password, msgNoRecordsFound, userNotExists, msgInvalidCredentials, Usuario, Contrasena;

	@BeforeTest
	public void beforeTest() {
		username = "Admin";
		password = "admin123";
		msgNoRecordsFound = "No Records Found";
		userNotExists = "XYZ";
		msgInvalidCredentials = "Invalid Credentials";
		Usuario = "Admin A";
		Contrasena = "Contrasena";
		
	}

	@Test
	public void tc001AdminSearchEmployee() {
		// Step 1
		Reporter.log("Open Browser \"OrangeHRM\" web page");

		System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chrome/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();

		// Step2
		Reporter.log("Enter Username, Password and click Login");
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();

		// Step 3
		Reporter.log("Validate that you have logged in successfully");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='welcome']")));

		// Step 4
		Reporter.log("Click Admin - Go to the admin page");
		driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Step 5
		Reporter.log("Search username in field \"Username");
		driver.findElement(By.id("searchSystemUser_userName")).sendKeys(username);

		// Step 6
		Reporter.log("Click search");
		driver.findElement(By.id("searchBtn")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Step 7
		Reporter.log("Verifiy username exists in table");
		String actualValue = driver.findElement(By.xpath("//tbody/tr[1]/td[2]")).getText();
		Assert.assertEquals(actualValue, username);

		// Step 8
		Reporter.log("Log out");
		driver.findElement(By.id("welcome")).click();
		driver.findElement(By.xpath("//a[contains(@href, 'logout')]")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Step 8
		Reporter.log("Close Browser");
		driver.close();
	}

	@Test
	public void tc002AdminSearchEmployeeNotExists() {
		// Step 1
		Reporter.log("Open Browser \"OrangeHRM\" web page");

		System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chrome/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();

		// Step2
		Reporter.log("Enter Username, Password and click Login");
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();

		// Step 3
		Reporter.log("Validate that you have logged in successfully");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='welcome']")));

		// Step 4
		Reporter.log("Click Admin - Go to the admin page");
		driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Step 5
		Reporter.log("Search username in field \"Username");
		driver.findElement(By.id("searchSystemUser_userName")).sendKeys(userNotExists);

		// Step 6
		Reporter.log("Click search");
		driver.findElement(By.id("searchBtn")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Step 7
		Reporter.log("Verifiy username exists in table");

		// Assert Equals
		String actualValue = driver.findElement(By.xpath("//tbody/tr")).getText();
		Assert.assertEquals(actualValue, msgNoRecordsFound);

		// AssertTrue
		// boolean isDisplayed = driver.findElement(By.xpath("//*[text()=\"No records
		// Found\"]")).isDisplayed();
		// Assert.assertTrue(isDisplayed);

		// Step 8
		Reporter.log("Log out");
		driver.findElement(By.id("welcome")).click();
		driver.findElement(By.xpath("//a[contains(@href, 'logout')]")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Step 8
		Reporter.log("Close Browser");
		driver.close();
	}

	@Test
	public void tc003AdminAddNewUser() {
		// Step 1
		Reporter.log("Open Browser \"OrangeHRM\" web page");

		System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chrome/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();

		// Step2
		Reporter.log("Enter Username, Password and click Login");
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();

		// Step 3
		Reporter.log("Validate that you have logged in successfully");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='welcome']")));

		// Step 4
		Reporter.log("Click Admin - Go to the admin page");
		driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Step 5
		Reporter.log("Click Add");
		driver.findElement(By.id("btnAdd")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Step 6
		Reporter.log("Enter valid Employee Name");
		driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys("Admin A");

		// Step 7
		Reporter.log("Enter valid username");
		driver.findElement(By.id("systemUser_userName")).sendKeys("ItatyCis");

		// Step 8
		Reporter.log("Enter new password");
		driver.findElement(By.id("systemUser_password")).sendKeys("Contrasena");

		// Step 9
		Reporter.log("Confirm Password");
		driver.findElement(By.id("systemUser_confirmPassword")).sendKeys("Contrasena");

		// Step 10
		Reporter.log("Click Save");
		driver.findElement(By.id("btnSave")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Step 11
		Reporter.log("Search username in field Username");
		driver.findElement(By.id("searchSystemUser_userName")).sendKeys("ItatyCis");

		// Step 12
		Reporter.log("Click Search");
		driver.findElement(By.id("searchBtn")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Step 13
		Reporter.log("Verify username exist in table");
		String actualValue = driver.findElement(By.xpath("//tbody/tr[1]/td[2]")).getText();
		Assert.assertEquals(actualValue, "ItatyCis");

		// Step 14
		Reporter.log("Log out");
		driver.findElement(By.id("welcome")).click();
		driver.findElement(By.xpath("//a[contains(@href, 'logout')]")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Step 15
		Reporter.log("Close Browser");
		driver.close();
	}
	
	@Test
	public void tc004AdminDeleteUser() {
		// Step 1
		Reporter.log("Open Browser \"OrangeHRM\" web page");

		System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chrome/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();

		// Step2
		Reporter.log("Enter Username, Password and click Login");
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();

		// Step 3
		Reporter.log("Validate that you have logged in successfully");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='welcome']")));

		// Step 4
		Reporter.log("Click Admin - Go to the admin page");
		driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		
		// Step 5
		Reporter.log("Search username in field Username");
		driver.findElement(By.id("searchSystemUser_userName")).sendKeys("ItatyCis");

		// Step 6
		Reporter.log("Click Search");
		driver.findElement(By.id("searchBtn")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Step 7
		Reporter.log("Verify username exists in table");
		String actualValue = driver.findElement(By.xpath("//tbody/tr[1]/td[2]")).getText();
		Assert.assertEquals(actualValue, "ItatyCis");
		
		//Step 8
		Reporter.log("Select user");
		driver.findElement(By.id("ohrmList_chkSelectRecord_48")).click();
		
		//Step 9
		Reporter.log("Click Delete");
		driver.findElement(By.id("btnDelete")).click();
		
		
		//Step 10
		Reporter.log("Validate pop-window is displayed: \"Delete Records?\"");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("deleteConfModal")));

		//Step 11
		Reporter.log("Click Ok to confirm delete user");
		driver.findElement(By.id("dialogDeleteBtn")).click();
		
		//Step 12
		Reporter.log("Validate in table that user was delete successfully");
		driver.findElement(By.id("searchSystemUser_userName")).sendKeys("ItatyCis");
		driver.findElement(By.id("searchBtn")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


		// Step 13
		Reporter.log("Log out");
		driver.findElement(By.id("welcome")).click();
		driver.findElement(By.xpath("//a[contains(@href, 'logout')]")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Step 15
		Reporter.log("Close Browser");
		driver.close();
		

	}
	

	@Test
	public void tc005AdminCreateUserDisabled() throws InterruptedException {
		// Step 1
		Reporter.log("Open Browser \"OrangeHRM\" web page");

		System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chrome/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();

		// Step2
		Reporter.log("Enter Username, Password and click Login");
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();

		// Step 3
		Reporter.log("Validate that you have logged in successfully");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='welcome']")));

		// Step 4
		Reporter.log("Click Admin - Go to the admin page");
		driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Step 5
		Reporter.log("Click Add");
		driver.findElement(By.id("btnAdd")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Step 6
		Reporter.log("Enter valid Employee Name");
		driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys("Admin A");

		// Step 7
		Reporter.log("Enter valid username");
		driver.findElement(By.id("systemUser_userName")).sendKeys("ItatyCis3");

		//Step 8
		Reporter.log("Change Status Disabled");
		Select drpStatus = new Select(driver.findElement(By.id("systemUser_status")));
		drpStatus.selectByVisibleText("Disabled");
						
		// Step 9
		Reporter.log("Enter new password");
		driver.findElement(By.id("systemUser_password")).sendKeys("Contrasena");

		// Step 9
		Reporter.log("Confirm Password");
		driver.findElement(By.id("systemUser_confirmPassword")).sendKeys("Contrasena");

		// Step 10
		Reporter.log("Click Save");
		Thread.sleep(2000);
		driver.findElement(By.id("btnSave")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Step 11
		Reporter.log("Search username in field Username");
		driver.findElement(By.id("searchSystemUser_userName")).sendKeys("ItatyCis3");

		// Step 12
		Reporter.log("Click Search");
		driver.findElement(By.id("searchBtn")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Step 13
		Reporter.log("Verify  is Disabled Status in table");
		String actualValue = driver.findElement(By.xpath("//tbody/tr[1]/td[5]")).getText();
		Assert.assertEquals(actualValue, "Disabled");

		// Step 14
		Reporter.log("Log out");
		driver.findElement(By.id("welcome")).click();
		driver.findElement(By.xpath("//a[contains(@href, 'logout')]")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Step 15
		Reporter.log("Close Browser");
		driver.close();
	}
	
	@Test
	public void tc006ValidateUserAdmin() {
		// Step 1
		Reporter.log("Open Browser \"OrangeHRM\" web page");

		System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chrome/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();

		// Step2
		Reporter.log("Enter Username, Password and click Login");
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();

		// Step 3
		Reporter.log("Validate that you have logged in successfully");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='welcome']")));

		// Step 4
		Reporter.log("Click Admin - Go to the admin page");
		driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Step 5
		Reporter.log("Search username in field \"Username");
		driver.findElement(By.id("searchSystemUser_userName")).sendKeys("Admin");

		// Step 6
		Reporter.log("Click search");
		driver.findElement(By.id("searchBtn")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Step 7
		Reporter.log("Verifiy username exists in table");
		String actualValue = driver.findElement(By.xpath("//tbody/tr[1]/td[2]")).getText();
		Assert.assertEquals(actualValue, "Admin");

		// Step 8
		Reporter.log("Log out");
		driver.findElement(By.id("welcome")).click();
		driver.findElement(By.xpath("//a[contains(@href, 'logout')]")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Step 8
		Reporter.log("Close Browser");
		driver.close();
	}
	
	@Test
	public void tc007ValidateInvalidPassword(){
		// Step 1
				Reporter.log("Open Browser \"OrangeHRM\" web page");

				System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chrome/chromedriver.exe");
				WebDriver driver = new ChromeDriver();

				driver.get("https://opensource-demo.orangehrmlive.com/");
				driver.manage().window().maximize();

				// Step2
				Reporter.log("Enter Username,  enter wrong Password and click Login");
				driver.findElement(By.id("txtUsername")).sendKeys(username);
				driver.findElement(By.id("txtPassword")).sendKeys("Admin32");
				driver.findElement(By.id("btnLogin")).click();
				
				//Step 3
				Reporter.log("Verify error message when enter invalid password");
				WebDriverWait wait = new WebDriverWait(driver, 10);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='spanMessage']")));	
				
			
				// Step 8
				Reporter.log("Close Browser");
				driver.close();
	}

	@AfterTest
	public void afterTest() {
	}

}
