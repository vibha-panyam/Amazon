package org.amazon.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class ProjectSpecificMethods {
	public static ChromeDriver driver;
	@BeforeMethod
	public void login()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 driver=new ChromeDriver();
		
		 driver.manage().window().maximize();
		 driver.get("https://www.amazon.in/");
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

}
