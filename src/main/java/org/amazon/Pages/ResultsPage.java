package org.amazon.Pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.amazon.base.ProjectSpecificMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ResultsPage extends ProjectSpecificMethods{
	
	public void printPrice()
	{
	List<WebElement> price=driver.findElements(By.className("a-price-whole"));
		
		System.out.println("The price of First Search Result : "+price.get(0).getText());
	}
	
	public CartPage clickFirstMobResult()
	{
		List<WebElement> firstImage=driver.findElements(By.className("s-image"));
		firstImage.get(0).click();
		Set<String> allWinSet = driver.getWindowHandles();
		List<String> windowsList=new ArrayList<String>();
		windowsList.addAll(allWinSet);
		driver.switchTo().window(windowsList.get(1));
		return new CartPage();
	}
	
	

}
