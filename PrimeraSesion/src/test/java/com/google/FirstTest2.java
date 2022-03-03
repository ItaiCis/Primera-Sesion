package com.google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTest2 {
	
	public static WebDriver driver;

  @BeforeTest
  public void beforeTest() {
  }
  
  @Test
  public void googleTest() {
	  
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chrome/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		//driver.manage().window().maximize();
		
		Assert.assertEquals(driver.getTitle(), "Facebook - Log In or Sign Up");
		System.out.println("Facebook - Inicia sesión o regístrate");
		
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.facebook.com/");
		System.out.println("El URL es correcto");
		

  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}


//*[@id="email"]
//*[@id="pass"]