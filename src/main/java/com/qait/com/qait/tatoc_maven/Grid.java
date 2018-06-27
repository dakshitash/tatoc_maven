package com.qait.com.qait.tatoc_maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Grid {

public void clickBox(WebDriver driver) {
		
		driver.findElement(By.className("greenbox")).click();
		String expectedUrl = "http://10.0.1.86/tatoc/basic/frame/dungeon";
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(expectedUrl, actualUrl);
}
}