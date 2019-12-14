package org.amazon.Pages;

import org.amazon.base.ProjectSpecificMethods;


public class CartPage extends ProjectSpecificMethods{

	
	
	public CartPage clickAddToCart()
	{
		driver.findElementById("add-to-cart-button").click();
		return this;
	}
	
	public SignInPage clickProceedToBuy()
	{
		driver.findElementById("hlb-ptc-btn").click();
		return new SignInPage();
	}
}
