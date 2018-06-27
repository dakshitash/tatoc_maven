package com.qait.com.qait.tatoc_maven;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CookieHandling {
	
	public void addCookie(WebDriver driver) {
		driver.findElement(By.linkText("Generate Token")).click();
		String token = driver.findElement(By.id("token")).getText();
		String tokenValue = token.substring(7);
		Cookie cookie = new Cookie("Token", tokenValue);
		driver.manage().addCookie(cookie);
		driver.findElement(By.linkText("Proceed")).click();
		String expectedUrl = "http://10.0.1.86/tatoc/end";
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(expectedUrl, actualUrl);
	}

	
	

}
