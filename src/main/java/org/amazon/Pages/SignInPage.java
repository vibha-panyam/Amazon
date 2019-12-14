package org.amazon.Pages;

import org.amazon.base.ProjectSpecificMethods;

public class SignInPage extends ProjectSpecificMethods {

	
	
	public SignInPage clickContinue()
	{
		driver.findElementById("continue").click();
		return this;
	}
	
	
}
