package org.amazon.Pages;

import org.amazon.base.ProjectSpecificMethods;


public class HomePage extends ProjectSpecificMethods {

	public ResultsPage Search()
	{
		driver.findElementById("twotabsearchtextbox").sendKeys("Samsung Galaxy M30");
		driver.findElementByXPath("(//input[@type='submit'])[1]").click();
		return new ResultsPage();
	}
	
}
