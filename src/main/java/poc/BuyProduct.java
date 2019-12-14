package poc;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BuyProduct {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElementById("twotabsearchtextbox").sendKeys("Samsung Galaxy M30",Keys.ENTER);
		
		//WebElement findElementByClassName = driver.findElementByClassName("a-price-whole");
		List<WebElement> price=driver.findElements(By.className("a-price-whole"));
		
		System.out.println("The price of First Search Result : "+price.get(0).getText());
		
		List<WebElement> firstImage=driver.findElements(By.className("s-image"));
		firstImage.get(0).click();
		
		Set<String> allWinSet = driver.getWindowHandles();
		List<String> windowsList=new ArrayList<String>();
		windowsList.addAll(allWinSet);
	    
		driver.switchTo().window(windowsList.get(1));
		//driver.switchTo().window(driver.getWindowHandle());
		
		WebElement deliverMsg = driver.findElementById("ddmDeliveryMessage");
		System.out.println(deliverMsg.getText());
		
		driver.findElementById("add-to-cart-button").click();
		
		driver.findElementById("hlb-ptc-btn").click();
		
		if(driver.getTitle().contains("Sign In"))
		{
			System.out.println("You Are in Sign In Page");
		}
		else
		{
			System.out.println("You Are Not  in Sign In Page");
		}
		
		driver.findElementById("continue").click();
		
		WebElement errorMsg = driver.findElementByClassName("a-alert-content");
		
		if(errorMsg.getText()=="Enter your email or mobile phone number")
		{
			System.out.println("Error Message Verified");
		}
		}
}
