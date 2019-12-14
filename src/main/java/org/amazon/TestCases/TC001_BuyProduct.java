package org.amazon.TestCases;

import org.amazon.Pages.HomePage;
import org.amazon.base.ProjectSpecificMethods;
import org.testng.annotations.Test;

public class TC001_BuyProduct extends ProjectSpecificMethods  {

	@Test
	public void buyProduct()
	{
		new HomePage()
		.Search()
		.clickFirstMobResult()
		.clickAddToCart()
		.clickProceedToBuy()
		.clickContinue();
	}
}
