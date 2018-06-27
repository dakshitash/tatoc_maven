package com.qait.com.qait.tatoc_maven;
				
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Popup {

public void launchPopupWindow(WebDriver driver) {
		
		driver.findElement(By.linkText("Launch Popup Window")).click();
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		driver.findElement(By.id("name")).sendKeys("Dakshita Sharma");
		driver.findElement(By.id("submit")).click();
		driver.switchTo().window(tabs.get(0));
		driver.findElement(By.linkText("Proceed")).click();
		String expectedUrl = "http://10.0.1.86/tatoc/basic/cookie";
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(expectedUrl, actualUrl);
	}
}