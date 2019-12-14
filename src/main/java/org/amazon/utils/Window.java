package org.amazon.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.amazon.base.ProjectSpecificMethods;

public class Window extends ProjectSpecificMethods {

	public void addWindow()
	{
		Set<String> allWinSet = driver.getWindowHandles();
		List<String> windowsList=new ArrayList<String>();
		windowsList.addAll(allWinSet);
		driver.switchTo().window(windowsList.get(1));
	}
}
